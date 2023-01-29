import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;

public class MainTest {
    @Test
    @DisplayName("MAP should return correct value")
    public void contactKeysTest(){
        HashMap<String,  String> testMap=new HashMap<>();
        testMap.put("a",  "Hi");
        testMap.put("b",  "There");

        Main.contactKeys(testMap);


        String actualResult= testMap.get("ab");
        String expectedResult = "HiThere";
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("MAP doesnt contain key a or b")
    public void contactKeysMissABTest(){
        HashMap<String,  String> testMap=new HashMap<>();
        testMap.put("a",  "Hi");


        Main.contactKeys(testMap);

        boolean actualResult=testMap.containsKey("ab");
        Assertions.assertFalse(actualResult);


    }
    @Test
    @DisplayName("MAP contain value null")
    public void contactKeysValueNullTest(){
        HashMap<String,  String> testMap=new HashMap<>();
        testMap.put("a",  null);
        testMap.put("b", "Bor");

        Main.contactKeys(testMap);

        String actualResult=testMap.get("ab");
        String expectedResult="nullBor";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
