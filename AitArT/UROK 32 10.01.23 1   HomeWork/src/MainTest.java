import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
       /*
       Дан лист из Person (fName, lName, age). Необходимо получить лист из
       строк вида (Иванов И., 45) для всех людей, младше заданного возраста.
       В рамках данной задачи считаем, что исходный list не содержит
       значения null. Необходимо реализовать тесты.
        */

    @Test
    public static void printAgeMin (){
        List<Person> test=new ArrayList<>();
        test.add(new Person("Иван", "Иванов", 30));
        test.add(new Person("Вова", "Мухин"));
        test.add(new Person("Илья", "Муровец", 23));
        test.add(new Person("Катя", "Муровец"));
        test.add(new Person("Вася", "Петров", 52));
        test.add(new Person("Света", "Мурнина", 43));

        int  value = 0;

    }

}
