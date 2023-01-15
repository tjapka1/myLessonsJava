import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tools {
    public static void print(List<Product> inputList){
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }
    }
    public static List<Product> comparSortBrand(List<Product> inputList){
        ComparatorBrand comparatorBrand=new ComparatorBrand();
        List<Product> outputList=new ArrayList<>();
        Collections.sort(inputList, comparatorBrand);
        for (int i = 0; i < inputList.size(); i++) {
                outputList.add(inputList.get(i));
                }
        print(outputList);
        return outputList;
        }

    }
