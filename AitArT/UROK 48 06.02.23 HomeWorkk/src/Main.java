import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>>inter=new ArrayList<>();
        inter.add(List.of(1,2,3));
        inter.add(List.of(5,6,4));
        inter.add(List.of(7,8,9,10,12,11));
        inter.add(List.of(7,8,65, 10,12,11));

        List<Integer>res=merge(inter);
        System.out.println(inter);
        System.out.println(res);

    }
    public static List<Integer>merge(List<List<Integer>>inList){
        List<Integer>ouList=new ArrayList<>();
        List<Integer>t;
        for (List<Integer> list:inList){
            t=list;
            for (Integer n:t){
                try {
                    if (n !=null){
                        ouList.add(n);
                    }
                }catch (Exception e){
                    System.out.println("Err NULL");
                }

            }
        }
        Collections.sort(ouList);
        return ouList;
    }
}