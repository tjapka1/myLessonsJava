import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String [] words={"Пётр","Гоша","Андрей"};
        byte[] numsArrat={4, 100, 5, 6, 2};

        numsArrat[1]+=10;
        byte [] newArray= Arrays.copyOf(numsArrat, numsArrat.length*2);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        System.out.println("___________");
    byte [] [] arr= new byte[][] {
            {5,3,5},
            {4,2,3},
            {7,2,2},
    };
        System.out.println(arr[1][2]);
    arr[1][2]=45;
        System.out.println(arr[1][2]);
        System.out.println("___________ArrayList ");

        ArrayList<Integer>arrDynamc=new ArrayList<>(0) ;
        arrDynamc.add(45);
        arrDynamc.add(145);
        arrDynamc.add(23);
        arrDynamc.add(8);
        arrDynamc.add(13);

        System.out.println(arrDynamc.get(0));
        System.out.println("_____");
        arrDynamc.set(0, 50);
        System.out.println(arrDynamc.get(0));
        System.out.println("___________LinkedList ");

        LinkedList<String>arrNames=new LinkedList<>() ;
        arrNames.add("Hello");
        arrNames.add("World");

        System.out.println(arrNames.get(0));
        System.out.println("_____");
         System.out.println(arrNames.get(1));
    
    }
}