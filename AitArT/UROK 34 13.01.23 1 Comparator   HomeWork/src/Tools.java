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
        System.out.println("______Brand_____");
        print(outputList);
        return outputList;
        }
    public static List<Product> comparSortPriceMin(List<Product> inputList){
        ComparatorPriceMin comparatorPriceMin =new ComparatorPriceMin();
        List<Product> outputList=new ArrayList<>();
        Collections.sort(inputList, comparatorPriceMin);
        for (int i = 0; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));
        }
        System.out.println(" __________Min Price____________");
        print(outputList);
        return outputList;
    }
    public static List<Product> comparSortPriceMax(List<Product> inputList){
        ComparatorPriceMax comparatorPriceMax=new ComparatorPriceMax() ;
        List<Product> outputList=new ArrayList<>();
        Collections.sort(inputList, comparatorPriceMax);
        for (int i = 0; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));
        }
        System.out.println("_____Max Price__________");
        print(outputList);
        return outputList;
    }
    public static List<Product> comparSortQuanityMin(List<Product> inputList){
        ComparatorQuanityMin comparatorQunityMin = new ComparatorQuanityMin();
        List<Product> outpputList=new ArrayList<>();
        Collections.sort(inputList, comparatorQunityMin);
        for (int i = 0; i < inputList.size(); i++) {
            outpputList.add(inputList.get(i));
            }
        System.out.println(" _____Min Quanity_____");
        print(outpputList);
        return outpputList;
    }
    public static List<Product> comparSortQuanityMax(List<Product> inputList){
        List<Product>  outputList  = new ArrayList<>();
        ComparatorQuanityMax comparatorQuanityMax=new ComparatorQuanityMax();
        Collections.sort(inputList, comparatorQuanityMax);
        for (int i = 0; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));
        }
        System.out.println("______Max Quanity");
        print(outputList);
        return outputList;
    }

    }
