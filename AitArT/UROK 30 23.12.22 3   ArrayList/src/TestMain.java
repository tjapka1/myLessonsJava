import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    @Test
    public void test_findMaxValue(){
        List<Integer> dataIn=new ArrayList<>();
        dataIn.add(3);
        dataIn.add(14);
        dataIn.add(-32);
        dataIn.add(45);
        dataIn.add(16);
        dataIn.add(17);
        dataIn.add(23);
        dataIn.add(-34);

        int expectedRes=234;
        int realResult=Main.findMaxValue(dataIn);

Assertions.assertEquals(expectedRes, realResult);
    }
}
