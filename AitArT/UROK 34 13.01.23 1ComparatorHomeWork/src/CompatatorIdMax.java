public class CompatatorIdMax implements ProductCompararator{
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -2;
        }
        return 0;
    }

    @Override
    public String name() {
        return "Большой id";
    }
}
