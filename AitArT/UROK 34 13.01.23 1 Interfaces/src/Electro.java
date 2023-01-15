import java.util.Objects;

public class Electro extends Product  {
    private static int count=200;
    private  int id =0;
    private String category;
    private String futures;


    public Electro(String category, String brand, String name, double price, int quanity, String futures) {
        super(brand, name, price, quanity);
        this.id=++count;
        this.category=category;
        this.futures=futures;
    }

    public int getId() {
        return id;
    }
    public String getFutures() {
        return futures;
    }
    @Override
    public String toString() {
        return "Electro" +
                " | id=" + id +" | " +
                category + " | " +
                super.toString()+
                " futures " + futures ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electro electro = (Electro) o;
        return id == electro.id && Objects.equals(category, electro.category) && Objects.equals(futures, electro.futures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, category, futures);
    }
}
