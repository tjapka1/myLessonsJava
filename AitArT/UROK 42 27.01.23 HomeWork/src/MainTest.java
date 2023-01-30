import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Test
    @DisplayName("Words count")
    void wordsCount(){

        List<String> testWords = new ArrayList<>();
        testWords.add("da");
        testWords.add("ja");
        testWords.add("da");
        testWords.add("ne");
        testWords.add("da");
        testWords.add("ja");

        Map<String, Long> expectedMap = Main.wordsCount(testWords);
        Map<String, Long>result=new HashMap<>();
        result.put("ne", 1l);
        result.put("ja", 2l);
        result.put("da", 3l);

        Assertions.assertEquals(expectedMap, result);

    }


}
