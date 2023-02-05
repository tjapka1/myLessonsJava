import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Дан список машинн (нмарка, год выпуска, пробег, цена) Необходимо получить:
1) список машин старше определенного год
2) список машин с номером на букву
     */
    public static void main(String[] args) {

        List<Car> carList = List.of(
                new Car("Audi", "as26", 2005, 10_000, 3600),
                new Car("Bmw", "as27", 2016, 12_000, 3400),
                new Car("Opel", "as28", 2020, 14_000, 3800),
                new Car("Mercedes", "as29", 2022, 16_000, 3500)
        );
        System.out.println(getNewListOfCars(carList , new MyPredicateByYear(2020)));
    }
    public static List<Car> listOfCarsByYear(List<Car>inList, int year){
        List<Car>ouList=new ArrayList<>();
        for (Car car:inList){
            if(car.getYearsOfRelease()>=year){
                ouList.add(car);
            }
        }
        return ouList;
    }
    public static List<Car> listOfCarsByLetter(List<Car>inList, char letter){
        List<Car>ouList=new ArrayList<>();
        for (Car car:inList){
            if(car.getModel().charAt(0)==letter){
                ouList.add(car);
            }
        }

        return ouList;
    }
    public static List<Car> getNewListOfCars(List<Car> inList, MyPredicate myPredicate) {
        List<Car> ouList = new ArrayList<>();
        for (Car car : inList) {
            if (myPredicate.test(car)) {
                ouList.add(car);
            }
        }
        return ouList;
    }


}