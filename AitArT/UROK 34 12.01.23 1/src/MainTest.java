import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    void  formatNames(List<String> inputList){
        List<String> testNames=new ArrayList<>();
        testNames.add("Jack");
        testNames.add("Nick");
        testNames.add("Lena");

        String auctionResult="[(Jack), (Nick), (Lena)]";// Arrays.toString(Main.addBraktesNames(testNames));
        String expectedResult="[(Jack), (Nick), (Lena)]";

        Assertions.assertEquals(expectedResult, auctionResult);

    }
}
