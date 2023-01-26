import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {


    @Test
    public void noDublListTest(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Wasja", 62));
        personList.add(new Person("Wasja", 62));
        personList.add(new Person("Kolja", 62));
        personList.add(new Person("Wova", 23));
        personList.add(new Person("Wova", 23));

        List<Person>actualResult=Main.noDublList(personList);

        List<Person>expectedResult=new ArrayList<>();
        expectedResult.add(new Person("Kolja", 62));
        expectedResult.add(new Person("Wova", 23));
        expectedResult.add(new Person("Wasja", 62));

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
