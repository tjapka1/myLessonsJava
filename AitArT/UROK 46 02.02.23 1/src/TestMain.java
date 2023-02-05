import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    @Test
    @DisplayName("xcv")
    void listOfCarsByYear() {
        List<Car> testList = List.of(
                new Car("Audi", "as26", 2005, 10_000, 3600),
                new Car("Bmw", "as27", 2016, 12_000, 3400),
                new Car("Opel", "as28", 2020, 14_000, 3800),
                new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );

        List<Car> expectedList = Main.listOfCarsByYear(testList, 2020);
        List<Car> resultList = List.of(
                new Car("Opel", "as28", 2020, 14_000, 3800),
                new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );

        Assertions.assertEquals(expectedList, resultList);
    }

    @Test
    @DisplayName("xcv")
    void listOfCarsByLetter() {
        List<Car> testList = List.of(
                new Car("Audi", "as26", 2005, 10_000, 3600),
                new Car("Bmw", "as27", 2016, 12_000, 3400),
                new Car("Opel", "as28", 2020, 14_000, 3800),
                new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );

        List<Car> expectedList = Main.listOfCarsByLetter(testList, 'O');
        List<Car> resultList = List.of(
                new Car("Opel", "as28", 2020, 14_000, 3800)
                //new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );

        Assertions.assertEquals(expectedList, resultList);
    }

    @Test
    void getNewListOfCars2() {
        List<Car> testList = List.of(
                new Car("Audi", "as26", 2005, 10_000, 3600),
                new Car("Bmw", "as27", 2016, 12_000, 3400),
                new Car("Opel", "as28", 2020, 14_000, 3800),
                new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );

        List<Car> actualResult = Main.getNewListOfCars(testList, new MyPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getModel().charAt(0) == 'B';
            }
        });
        List<Car> expectedResult = new ArrayList<>();

        expectedResult.add(new Car("Bmw", "as27", 2016, 12_000, 3400));

        Assertions.assertEquals(expectedResult, actualResult);

    }
}