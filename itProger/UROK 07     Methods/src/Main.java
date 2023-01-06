import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] names={"Джон", "Боб", "Джордж",};
        String [] subnames={"Марли", "Джерки", "Скворовский",};
        int [] ages ={50,21,18};

        printArr(names);
        printArr(ages);

        int result= summa(10,5);
        System.out.println(result);
        int result1= summa(10,5,15);
        System.out.println(result1);

        String[] names2=new String[3];
        String[] subnames2=new String[3];
        int[] ages2=new int[3];
        makeArr(names2);
        makeArr(subnames2);
        makeArr(ages2);
        printArr(names2);
        printArr(subnames2);
        printArr(ages2);
    }
    public static String[] makeArr(String [] arr){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите "+ i +" элемент: ");
            arr[i]=in.nextLine();

        }
        return arr;
    }
    public static int[] makeArr(int [] arr){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите "+ i +" элемент: ");
            arr[i]=in.nextInt();

        }
        return arr;
    }
    public static void printArr(String[]arr){
        for (String res:arr) System.out.println("Значение элемента: " + res);
    }
    public static void printArr(int[]arr){
        for (int res:arr) System.out.println("Значение элемента: " + res);
    }

    public static int summa(int a, int b){
        int res=a+b;
        return res;
    }
    public static int summa(int a, int b, int c){
        int res=a+b+c;
        return res;
    }
}