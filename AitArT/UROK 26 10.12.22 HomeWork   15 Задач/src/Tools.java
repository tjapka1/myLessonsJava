import java.util.Arrays;

public class Tools {
    public static int degre1(int num) {
        /*
        Написать метод, который принимает параметр типа int и возвращает
        третью степень этого числа++.
         */
        int res;
        return res = num * num * num;
    }

    public static int[] getEven2(int  n, int a) {
/*
3.      Написать метод, который создает массив из n целых четных чисел больше или равных заданному числу  a. Например:
 getEven(n=7, a=4) -> {4,6,8,10,12,14,16}

 */
        if (n<=0){
            return new int[0];
        }
        int [] res = new int[n];
        a= a%2!=0?a+1:a;

            for (int i = 0; i <res.length; i++) {
            res[i] = a;
            a += 2;
        }
              return res;
    }


    public static int getLastDig3(int num) {
       /*
           2.      Написать метод, который возвращает значение последнего разряда числа.     Например:
getLastDigit(175) -> 5
getLastDigit(17) -> 7
getLastDigit(1529) -> 9
        */

        int res = 0;
        res = num % 10;
        return res;
    }

    public static int indexOfMaxDig4(int[] arr) {
/*
Написать метод, который принимает массив целых чисел и возвращает
индекс наибольшего числа в этом массиве. Например:
{5, 9, -1, 6, 10, 1, 8} -> 4*/
        if (arr==null||arr.length==0){return -1;}
        int maxInd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxInd]) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    public static String lengthName5(String[] name) {
        /*
        5.      Написать метод, который принимает массив строк и
        возвращает самую длинную строку в этом массиве. Например:
        {“John”, “Nicolaus”, “Ann”} -> “Nicolaus”
         */
        if (name==null||name.length==0){return null;}

        String res = "";
        for (int i = 0; i < name.length; i++) {
            if (name[i]!=null ) {
                if (name[i].length() > res.length()) {
                    res = name[i];
                }
            }
        }
        return res;
    }
    public static Person person6(Person []  people) {
  /*6.      Написать метод, который принимает массив Person(String name, int age) и
    возвращает самого взрослого человека в этом массиве. Например:
    {John 23  , Nicolaus 45, Ann 21} -> Nicolaus */
        Person oldesPersoon = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i]!=null ) {
                if (people[i].getAge()> oldesPersoon.getAge()) {
                    oldesPersoon = people[i];
                }
            }
        }
        return oldesPersoon;


    }

    public static String formatName7(String[] names) {
/*
7.      Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия,
а в качестве результата возвращает массив строк вида «И.Иванов» . Например:
{“Иван Иванов”, “Николай Николаев”, “Петр Петров”} -> {“И.Иванов”, “Н.Николаев”, “П.Петров”}
*/
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            int index = names[i].indexOf(" ");
            String form = names[i].substring(0, 1) + ". " + names[i].substring(index + 1);
            res[i] = form;
        }
        return Arrays.toString(res);
    }

    public static String splitName8(String[] names) {
        /*
        8.      Написать метод, который принимает массив строк вида “Иван Иванов”,
        т.е. имя и фамилия, а в качестве результата возвращает массив объектов
        типа Student{String firstName, String lastName} .
         */
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            int index = names[i].indexOf(" ");
            String firstname = names[i].substring(0, index);
            String laststname = names[i].substring(index + 1);
            String form = "Firstname: " + firstname + " " + "Lastname: " + laststname + "\n";
            res[i] = form;
        }
        return Arrays.toString(res);
    }

    public static int sumAllDig9(int num) {
    /*
    9.      Дано целое число num. Необходимо написать метод,
    который посчитает сумму разрядов этого числа. Например: 3459 -> 21
     */
        int res = 0;
        num=Math.abs(num);
        while (num != 0) {
            res += num % 10;
            num =num/ 10;
        }
        return res;
    }

    public static void getPrimeNumbers10(int num) {
/*
10.   Число называется простым, если делиться без остатка только на единицу
или на само себя. Реализовать метод, который выводит n простых чисел. Например:
getPrimeNumbers(10) -> 1   2   3   5   7   11   13   17    19	23
 */
        for (int i = 1; i < num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " | ");
            }
        }
    }


    public static String[] flag11(String[] arr, boolean flag) {
        /*
        11.    Дан массив строк. Написать метод, который принимает
        данный массив и параметр boolean flag.
Метод должен возвращать новый массив строк, но,
в зависимости от значения flag, метод должен возвращать либо массив,
содержащий все элементы исходного массива с
четными индексами, либо, наоборот, с нечетными индексами.
Например:
{“John”, “Nicolaus”, “Ann”}, true -> {“John”, “Ann”}
{“John”, “Nicolaus”, “Ann”}, false -> {“Nicolaus”}
         */
        int len=arr.length/2;
        if (flag && arr.length%2!=0){
            len++;}

        String[] res = new String[len];
        int index=0;
        if (!flag){
            index=1;
        }
        for (int i = 0; i < res.length; i++) {
            res[i]=arr[index];
            index+=2;
        }

        return res;
    }

    public static void bubleSort12(int[] nums) {
        /*
        12.     Дан массив целых чисел. Написать метод, который сортирует
        данный массив в порядке возрастания.
        Использовать любой известный вам алгоритм сортировки.
         */
        boolean flag=true;

        for (int i=0 ; i<nums.length-1 && flag; i++ ) {
            flag=false;
            for (int j = 0; j < nums.length-1 ; j++) {
                if (nums[j+1] < nums[j ]) {
                    flag=true;
                }
            }
        }
    }

private static void swap(int [] arr, int j1, int j2){
    int t = arr[j1];
    arr[j1] = arr[j2 + 1];
    arr[j1 + 1] = t;

}
private static boolean isSwaoneeded( int [] arr, int i1, int i2){
        return arr[i1]<arr[i2];
}

    public static void lenghtsort13(String[] arr) {
        /*
        13.     Дан массив строк. Написать метод, который сортирует данный массив в
        порядке возрастания длин строк, от самой
        короткой до самой длинной. Использовать любой известный вам алгоритм сортировки.
        (Для решения данной задаче нельзя использовать
        встроенные методы сортировки Java )

         */
        for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].length() < arr[i + 1].length()) {
                    String t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
                System.out.println(arr[i]);
            }

    }
}