import java.util.Objects;

public class Food extends Product{
    private static int count=100;
    private  int id =0;
    public Food(String brand, String name, double price, int quanity) {
        super(brand, name, price, quanity);
        this.id=++count;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Food" +
                " | id=" + id +" | " +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
