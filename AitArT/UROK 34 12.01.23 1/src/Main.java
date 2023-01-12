import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Jack");
        names.add("Nick");
        names.add("Lena");
        System.out.println(names);

        List<String> addBr=addBraktesNames(names);
        System.out.println(addBr);
        System.out.println(listHandler(names, new WordTransformerAddRoundBrackets()));
        System.out.println(listHandler(names, new WordTransformerAddSquareBrackets()));
        List<String> strings = listHandler(names, new WordTransformerToUpperCase());
        System.out.println(listHandler(strings, new WordTransformerAddRoundBrackets()));

        WordTransformer wt= new WordTransformerAddSquareBrackets();
        WordTransformerAddRoundBrackets wt2= new WordTransformerAddRoundBrackets();

        System.out.println(listHandler(names, new Person("qw","qw1",3)));

    }
    public static List <String> addBraktesNames(List<String> inputList){
        List<String>outputList=new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            String inStr=inputList.get(i);
            String outStr="("+inStr+")";
            outputList.add(outStr);
        }
        return outputList;
    }
    public static List<String> listHandler(List<String> list, WordTransformer obj) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultList.add(obj.transform(list.get(i)));
        }
        return resultList;
    }

    
}