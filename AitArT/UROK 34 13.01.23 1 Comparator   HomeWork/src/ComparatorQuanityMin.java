public class ComparatorQuanityMin implements ProductCompararator{
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getQuanity()>o2.getQuanity()){return 1;}
            else if (o1.getQuanity()<o2.getQuanity()){return -2;}
            return 0;
        }

    @Override
    public String name() {
        return "Минимальное кличество на Складе";
    }
}

