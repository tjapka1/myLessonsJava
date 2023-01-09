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
        System.out.println(num.size());                                                                //вот тут добавляю я ещё 23 числа, к двум существующем, первые 2 числа не изменились

        getRndList(num, 30, 100, 1);
        System.out.println(num);
        System.out.println(num.size());                                                                // тут я добовляю ещё 5 числа, но с 3 по 25 число тоже меняються

        getRndList(num, 50, 100, 1);
        System.out.println(num);
        System.out.println(num.size());                                                                // тут я добовляю ещё 20 числа, но с 3 по 30 число тоже меняються

        getRndList(num, 53, 0, -5);
        System.out.println(num);
        System.out.println(num.size());                                                                // тут я добовляю ещё 3 числа, но с 3 по 50 число тоже меняються

                                                                                                                        // Кал сделать чтоб только добавляющие Числа генерировались


                                                                                                                        // А старые оставались и не генерировались заново??????????

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