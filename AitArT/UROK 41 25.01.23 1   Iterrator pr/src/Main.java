import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num1 =new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(3);

        List<Integer>  num2 =new ArrayList<>();
         num2.add(0);
         num2.add(2);
         num2.add(6);
        num2.add(1);
        num2.add(3);

        print(num1);
        print(num2);
        List<Integer> dubl = getInterSection(num1, num2);
        print(dubl);
    }
    public static List<Integer> getInterSection(List<Integer> inputList1, List<Integer> inputList2){
        HashSet<Integer> out=new HashSet<>(inputList1);
        out.retainAll(new HashSet<>(inputList2));
        return new ArrayList<>(out);
    }
    public static List<Integer> intSort(List<Integer>inputList){
        List<Integer>outputList=new ArrayList<>();

        return outputList;
            }

    public static void print(List<Integer>list){
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}