public class ComparatorQuanityMax implements ProductCompararator {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getQuanity()<o2.getQuanity())return 56;
        else if (o1.getQuanity()>o2.getQuanity())return -52;
        return 0;
    }

    @Override
    public String name() {
        return "Максимальное кличество на Складе";
    }
}
