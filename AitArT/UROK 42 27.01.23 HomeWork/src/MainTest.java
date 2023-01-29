import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    @DisplayName("Filter of Wors")
    void filterWords(){
        List<String> testList=new ArrayList<>();
        testList.add("da");
        testList.add("ja");
        testList.add("da");
        testList.add("ne");
        testList.add("da");
        testList.add("ja");

        List<String> expectedList=Main.filterWords(testList);
        List<String>result=new ArrayList<>();
        result.add("ja");
        result.add("ne");
        result.add("da");

        Assertions.assertEquals(expectedList, result);
    }
    @Test
    @DisplayName("String Words to List")
    void textStringToList(){
        String testString="vova dai mne";

        List<String>expectedList=Main.textStringToList(testString);
        List<String>result=new ArrayList<>();
        result.add("vova");
        result.add("mne");
        result.add("dai");

        Assertions.assertEquals(expectedList, result);
    }


}
