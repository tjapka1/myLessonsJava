import java.util.List;

public class SortFunktion {
    public static void sortList(List<Product>  inputList){
        ProductCompararator [] compararators={
                new ComparatorBrand(),
                new ComparatorPriceMin(),
                new ComparatorPriceMax(),
                new CompatatorIdMin(),
                new CompatatorIdMax(),
                new ComparatorQuanityMin(),
                new ComparatorQuanityMax(),
        };
        ComparatorSelector comparatorSelector=new ComparatorSelector(compararators);
        comparatorSelector.select(inputList);
    }
}
