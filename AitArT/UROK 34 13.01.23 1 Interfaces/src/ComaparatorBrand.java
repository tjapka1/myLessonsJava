import java.util.Comparator;

class ComparatorBrand implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getBrand().equals(o2.getBrand())){return 1;}
        else if (!o1.getBrand().equals(o2.getBrand())){return -1;}
        return 0;
    }

}
