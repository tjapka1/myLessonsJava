import java.util.Arrays;
import java.util.Objects;

public abstract class Product  {

    private String[] artikelArt;
    private String brand;
    private String name;
    private double price;
    private int quanity;

    public Product(String brend, String name, double price, int quanity) {
        this.brand = brend;
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
    public abstract int getId();

    ;
    @Override
    public String toString() {
        return
                "Brand " + brand +
                        ", Name " + name +
                        ", Price " + price +
                        ", quanity=" + quanity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quanity == product.quanity && Arrays.equals(artikelArt, product.artikelArt) && Objects.equals(brand, product.brand) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, name, price, quanity);
        result = 31 * result + Arrays.hashCode(artikelArt);
        return result;
    }
}