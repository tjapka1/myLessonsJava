import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
    /*
    Есть список машин (номер, модель, год выпуска),
    нужно написать метод, которая вернет мапу,
    где ключом является "возраст" маашины,
    а значением список машин этого года.
     */
    public final static int YEAR=2023;
    public static void main(String[] args) {

    }
    public static Map<Integer, HashSet<Car>> listOfCars(List<Car> inListCar){
        Map<Integer, HashSet<Car>> outMapCar=new HashMap<>();
            for (Car car : inListCar){
                int carAge= getCurrentYear() - car.getYearsOfRelease();
                if (!outMapCar.containsKey(carAge)) {                                              // проверили, содержит ли мэпа ключ
                    HashSet<Car> cars = new HashSet<>();                                     //создали новый сет для нового ключа
                    cars.add(car);                                                                               // положили машинку по новому ключу
                    outMapCar.put(carAge, cars);                                                        // добавили сет в мэпу
                } else {
                    HashSet<Car> hashSet = outMapCar.get(carAge);                        // получили значение сета по ключу
                    hashSet.add(car);                                                                         // положили машинку по старому ключу
                    outMapCar.put(carAge, hashSet);                                                  // перезаписали значение в мэпу по ключу
                }
            }
        return outMapCar;
    }
    public static int getCurrentYear(){return YEAR;}
}