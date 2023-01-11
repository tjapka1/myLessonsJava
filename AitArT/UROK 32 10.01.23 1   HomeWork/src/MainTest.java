import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
       /*
       Дан лист из Person (fName, lName, age). Необходимо получить лист из
       строк вида (Иванов И., 45) для всех людей, младше заданного возраста.
       В рамках данной задачи считаем, что исходный list не содержит
       значения null. Необходимо реализовать тесты.
        */


    @Test
    public void initialsNameTest(){
        Person [] people={
                new Person("Иван", "Иванов", 30),

        };
        String [] expectedResult ={"И.", };
        String[] actualResult = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            actualResult[i]=people[i].firstNameFormat();
        }
        Assertions.assertEquals(Arrays.asList(expectedResult), Arrays.asList(actualResult));

    }

}
