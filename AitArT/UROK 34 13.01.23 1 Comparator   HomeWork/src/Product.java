import java.util.Objects;

public abstract class Product  {

    String brand;
     String name;
     double price;
    int quanity;

    Product(String brend, String name, double price, int quanity) {
        this.brand = brend;
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    double getPrice() {
        return price;
    }

     int getQuanity() {
        return quanity;
    }

     void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    String getBrand() {
        return brand;
    }

    String getName() {
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
        return Double.compare(product.price, price) == 0 && quanity == product.quanity &&  Objects.equals(brand, product.brand) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, name, price, quanity);
            return result;
    }
}