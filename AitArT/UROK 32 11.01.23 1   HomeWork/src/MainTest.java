import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    void mergeSting(){

        List<String> testStrings=new ArrayList<>();
        testStrings.add("I");
        testStrings.add("do");
        testStrings.add("my");
        testStrings.add("homework");

        String expected = "I do my homework";

        Assertions.assertEquals(expected, Main.mergeString(testStrings));
    }
    @Test
    void mergeSting2(){

        List<String> testStrings=new ArrayList<>();
        testStrings.add("I");
        testStrings.add("do");
        testStrings.add("   ");
        testStrings.add("homework");

        String expected = "I do homework";

        Assertions.assertEquals(expected, Main.mergeString(testStrings));
    }
    @Test
    void mergeSting3(){

        List<String> testStrings=new ArrayList<>();
        testStrings.add("I");
        testStrings.add("do");
        testStrings.add(null);
        testStrings.add("homework");

        String expected = "I do homework";

        Assertions.assertEquals(expected, Main.mergeString(testStrings));
    }
@Test
    public void userToString(){
    List<User> testUsers=new ArrayList<>();
    testUsers.add(new User("Durkovf", "Walja", 23));

    //Вот тут почему то не выходит
        User actionResult= Main.chenchLsFsName(testUsers,1);
        String expectedResult="1 | Walja Durkovf 23";

        Assertions.assertEquals(expectedResult, actionResult);
    }


}
