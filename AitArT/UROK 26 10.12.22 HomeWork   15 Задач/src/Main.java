import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("______1______");
        System.out.println(Tools.degre1(3));
        System.out.println("______2______");
        System.out.println(Tools.getLastDig3(23));
        System.out.println("______3______");

        System.out.println(Arrays.toString(Tools.getEven2(7,4)));
        System.out.println("______4_____");
        int[] nums2 = {5, 9, -1, 6, 10, 1, 8};
        System.out.println(Tools.indexOfMaxDig4(nums2));
        System.out.println("______5______");
        String[] name = {"John", "Nicolaus", "Ann"};
        System.out.println(Tools.lengthName5(name));
        System.out.println("______6______");
        Person[] per={new Person("John",  23),
                new Person("Nicolaus", 45),
                new Person("Ann" ,21)};
        System.out.println( Tools.person6(per));
        System.out.println("______7______");
        String[] names={"Иван Иванов", "Николай Николаев", "Петр Петров"};
        System.out.println(Tools.formatName7(names));
        System.out.println("______8______");
        String[] names1={"Иван Иванов", "Николай Николаев", "Петр Петров"};
        System.out.println(Tools.splitName8(names1));
        System.out.println("______9______");
        int a=555;
        System.out.println(Tools.sumAllDig9(a));
        System.out.println("______10______");
        Tools.getPrimeNumbers10(25);
        System.out.println(" ");
        System.out.println("______11______");
        String[] name3={"John", "Nicolaus", "Ann"};
        System.out.println(Arrays.toString(Tools.flag11(name3, true)));
        System.out.println(Arrays.toString(Tools.flag11(name3, false)));


        System.out.println("______12______");
        int [] num={5, 2, 1, 3, 4};
        System.out.println(Arrays.toString(num));
        Tools.bubleSort12(num);
        System.out.println(Arrays.toString(num));

        System.out.println("______13______");
        Tools.lenghtsort13(name3);

    }


}