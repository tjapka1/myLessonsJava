import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {

    List<String> stringList=new ArrayList<>();

    stringList.add("zdee as");
        stringList.add("asd as da");
        stringList.add("sdf zz xc dcz fvdr dxs");

        System.out.println(countLennghts(stringList));
        System.out.println("______");
        System.out.println(countAEI(stringList));
        System.out.println("___________");
        System.out.println(countWords(stringList));
    }
       public static List<Integer>countLennghts(List<String>inList){
        List<Integer>ouList=new ArrayList<>();
        for (String s:inList){
            ouList.add(s.length());
        }
        return ouList;
               }

    public static List<Integer>countWords(List<String>inList){
        List<Integer>ouList=new ArrayList<>();
        String x = " ";
        int count =1;
        for (String s:inList){
            if (s.contains(x)){
                ouList.add(++count);
            }
        }
        return ouList;
    }
    public static Map<Character, Integer>countAEI (List<String>inList){
        Map<Character, Integer> ouMap=new HashMap<>();
        List<Character>aei=List.of('a', 'o',  'e');
        int count=0;
        for (String s:inList){
            for (int i = 0; i < s.length(); i++) {
               if (aei.contains(s.charAt(i))){
                   count++;
                   ouMap.put(s.charAt(i),count);
               }
           }
        }
        return ouMap;
    }
}