import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    @DisplayName("Should return List<Person>")
    void listNamesToListPerson(){

        List<Person> testList=new ArrayList<>();
        testList.add(new Person("Ivan"));
        testList.add(new Person("Maria"));
        testList.add(new Person("Stephan"));
        testList.add(new Person("John"));
        testList.add(new Person("Amalia"));

        List<Person> expected= new ArrayList<>();
        expected.add(new Person("Maria"));
        expected.add(new Person("Stephan"));
        expected.add(new Person("Amalia"));

        Assertions.assertEquals(expected, Main.listNamesToListPerson());
    }

    @Test
    @DisplayName("Should return List<Person>")
    void listNamesToListPerson(){

        List<String> testList=new ArrayList<>();
        testList.add("Ivan");
        testList.add("John");

        Assertions.assertTrue( Main.listNamesToListPerson(testList).isEmpty());
    }
}