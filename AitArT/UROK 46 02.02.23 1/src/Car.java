import java.util.Objects;

public class Car {
    /*
    Дан список машинн (нмарка, год выпуска, пробег, цена) Необходимо получить:
1) список машин старше определенного год
2) список машин с номером на букву
     */
    private String model;
    private String number;
    private int yearsOfRelease;
    private int mileage;
    private double price;

    public Car(String model, String number, int yearsOfRelease, int mileage, double price) {
        this.model = model;
        this.number = number;
        this.yearsOfRelease = yearsOfRelease;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYearsOfRelease() {
        return yearsOfRelease;
    }

    public void setYearsOfRelease(int yearsOfRelease) {
        this.yearsOfRelease = yearsOfRelease;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearsOfRelease == car.yearsOfRelease && mileage == car.mileage && Double.compare(car.price, price) == 0 && Objects.equals(model, car.model) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, yearsOfRelease, mileage, price);
    }

    @Override
    public String toString() {
        return  model + " " +
                number + " " +
                yearsOfRelease +" "+
                mileage + " "+
                price;
    }
}
