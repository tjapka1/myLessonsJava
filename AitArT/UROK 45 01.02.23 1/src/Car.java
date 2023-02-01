/*
    Есть список машин (номер, модель, год выпуска),
    нужно написать метод, которая вернет мапу,
    где ключом является "возраст" маашины,
    а значением список машин этого года.
     */

import java.util.Objects;

public class Car {
    private String model;
    private String number;
    private int yearsOfRelease;

    public Car(String model, String number, int yearsOfRelease) {
        this.model = model;
        this.number = number;
        this.yearsOfRelease = yearsOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getYearsOfRelease() {
        return yearsOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearsOfRelease == car.yearsOfRelease && Objects.equals(model, car.model) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, yearsOfRelease);
    }

    @Override
    public String toString() {
        return model +" "+ number + " "+yearsOfRelease ;
    }
}
