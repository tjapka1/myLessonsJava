import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userInput;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Введите число 5: ");
            userInput=sc.nextInt();
        }while (userInput!=5);
        System.out.println("Вы молодец!");

        short [] arr= new short[]  {5,7,1,234,3,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Значение элемента " + i + " = " +arr[i]);
        }

        int [] [] bigNums =new int[][]{
                {5,7,1,234},
                {2,3,8,122},
                {543,9,0,4},
                {56,98,6,0}
        };
        for (int i = 0; i < bigNums.length; i++) {
            for (int j = 0; j <bigNums[i].length ; j++) {
                System.out.print(bigNums[i][j]+", ");

            }
            System.out.println("");

        }

        ArrayList<String> names = new ArrayList<>(0);
        names.add("Боб");
        names.add("Мартин");
        names.add("Пётр");
        names.add("Иван");
        names.add("Алексей");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " " + names.get(i));
        }
        System.out.println("____");
        for (String el: names) System.out.print(el+". ");
        System.out.println("");

        System.out.println("_________");

        int i=0;
        while (i<10){
            if (i==5) break;
            if (i%2 ==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}