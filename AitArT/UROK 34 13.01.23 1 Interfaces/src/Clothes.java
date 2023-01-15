import java.util.Objects;

public class Clothes extends Product {
    private static int count=300;
    private  int id =0;
    private String category;
    private String size;
    public Clothes(String category, String brand, String name, double price, int quanity, String size) {
        super(brand, name, price, quanity);
        this.id=++count;
        this.category =category;
        this.size=size;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothes" +
                " | id=" + id +" | " +
                 category +", "+
                super.toString()+
                " Size " + size
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return id == clothes.id && Objects.equals(category, clothes.category) && Objects.equals(size, clothes.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, category, size);
    }
}
