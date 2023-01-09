import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList <Integer> num =new ArrayList<>();
        num.add(5);
        num.add(4);
        System.out.println(num);
        System.out.println(num.size());

        getRndList(num, 25, 10, 1);
        System.out.println(num);
        System.out.println(num.size());
        getRndList(num, 30, 100, 1);
        System.out.println(num);
        System.out.println(num.size());
        getRndList(num, 50, 100, 1);
        System.out.println(num);
        System.out.println(num.size());
        getRndList(num, 53, 0, -5);
        System.out.println(num);
        System.out.println(num.size());


        System.out.println("____________");
        System.out.println(getRndList(5,10,0));
        System.out.println(getRndList(15, 10, -10));


    }


    public static List<Integer> getRndList(int size, int max, int min){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(numRand(max, min));

        }
        return list;
    }

    public static List<Integer> getRndList(List<Integer> list, int newSize, int max, int min){
        int count= newSize - list.size();
        for (int i = 0; i < count; i++) {
            list.add(numRand(max, min));

        }
        return list;
    }


    public static int numRand(int max, int min){
        int add=(int) (min + Math.random() * ((long)max + 1 - min));
        return add;
    }



}