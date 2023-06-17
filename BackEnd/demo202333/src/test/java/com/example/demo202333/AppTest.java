package com.example.demo202333;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private static App application;
    private  static RepositoryService repository;
    private  static DBDriver driver;


    @BeforeAll
    public static void init(){
        System.out.println("befor");
        application = new App();
        repository = Mockito.mock(RepositoryService.class);
        driver = Mockito.mock(DBDriver.class);

    }
    @AfterAll
    public static void closed(){
        System.out.println("After");
        }
    @BeforeEach
    public  void startNewTes(){
        //System.out.println("@BeforeEach");
         }
    @AfterEach
    public  void stopNewTes(){
        //System.out.println("@AfterEach");
    }

    @Test
    @DisplayName("serch max")
    void findMax() {
        //Input
        //Run unit with input
        //compare real result and expected result
        Assertions.assertAll(
                ()-> Assertions.assertEquals(20, application.findMax(20,10), "первое число больше"),
                ()-> Assertions.assertEquals(20, application.findMax(10,20), "второе число больше"),
                ()-> Assertions.assertEquals(20, application.findMax(20,20), "равны"),
                ()-> Assertions.assertThrows(IllegalArgumentException.class, ()->application.findMax(null, 20), "first"),
                ()-> Assertions.assertThrows(IllegalArgumentException.class, ()->application.findMax(20, null), "Second")
        );
    }

    @ParameterizedTest (name = "{0} is good")
    @ValueSource(strings = {"1234321", "qweewq", "q"})
    @NullSource
    @EmptySource
    void isPalindrome(String str) {
    Assertions.assertTrue(application.isPalindrome(str));

    }

    @DisplayName("isPalindrome")
    @ParameterizedTest (name = "{0} is good")
    @CsvSource(
            {
                    "123321, true",
                    "qwerewq, true",
                    "q, true",
                    "qw, false"
            }
    )
    void isPalindrome(String str, boolean res) {
        Assertions.assertEquals(res, application.isPalindrome(str));
    }


    @DisplayName("isPalindrome")
    @ParameterizedTest (name="The {0} is palindrome: {1}")
    @CsvFileSource(resources = "/data.csv")
    void isPalindrome2(String str, boolean res) {
        Assertions.assertEquals(res,application.isPalindrome(str));
    }


    @ParameterizedTest
    @MethodSource("getArgumentsToTestFindMaxWithList")
    void testFindMax(List<Integer> list, Integer res) {
        Assertions.assertEquals(res,application.findMax(list));
    }

    private static Stream<Arguments> getArgumentsToTestFindMaxWithList(){
        return Stream.of(
                Arguments.of(List.of(1,2,3,4),4),
                Arguments.of(List.of(10,2,3,8),10)
        );
    }
    @Test
    public void saveString(){
        App app = new App(driver,repository );
        String stringToSave="Hello";
        app.saveString(stringToSave);
        // Mockito.verify(mock_object, Mockito.times(    ) )  проверка количества вызывов mock_object
        Mockito.verify(repository, Mockito.times(1) ).save(stringToSave);  // метод был вызван ровно 1 раз именно с этим параметром
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.any(String.class));   // метод был вызван ровно 1 раз с любой строкой
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.argThat(new Matcher()));   //метод был вызван ровно 1 раз с параметром удовлетворяющим Matcher().matches(String s)
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.argThat(s->s.length()==4));  // реализация через лямбда
        //Mockito.verify(repository, Mockito.never() ).save(Mockito.any(String.class));     //не было вызывов
        //Mockito.verify(repository, Mockito.atLeast(2) ).save(Mockito.any(String.class));   //хотя бы 2 раза с любым параметром
    }

}

class Matcher implements ArgumentMatcher<String> {
   @Override
    public boolean matches(String s) {
        return s.length()==4;
    }
}


