import java.util.Comparator;

public class ComparatorQuanityMin implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getQuanity()>o2.getQuanity()){return 1;}
            else if (o1.getQuanity()<o2.getQuanity()){return -2;}
            return 0;
        }
    }

