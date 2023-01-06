public class Homework {
    public static void main(String[] args) {
        /*Создайте метод типа void с именем reverse, который бы принимал массив и
        менял элементы массива местами - т.е. разворачивал массив (первые его элементы стали
        бы последними).
        Например, массив int[] numbers = {0, 19, 20, 14} после применения метода стал бы
              {14, 20, 19, 0}.
        (Вам может пригодиться дополнительная переменная для хранения данных)
        (Со звездочкой - перепишите решение, используя цикл while).*/


        int[] num = {0, 19, 20, 14, 3, 6 };
        System.out.println("___Orig___");
        printArray(num);
        System.out.println("___Vor___");
        translationArrayFor(num);
        printArray(num);
        System.out.println("___While___");
        int[] num2 = {0, 19, 20, 14, 3, 6};
        translationArrayWhile(num2);
        printArray(num2);
        System.out.println("___SortMin___");
        sortMin(num2);
        printArray(num2);
        System.out.println("___SortMax___");
        sortMax(num2);
        printArray(num2);
    }
    public static void translationArrayWhile(int[] arr) {
        int i = 0;
        int count = arr.length;
        while (i < arr.length) {
            if (i < count) {
                int t = arr[i];
                arr[i] = arr[count - 1];
                arr[count - 1] = t;
                count--;
            }
            i++;
        }
    }
    public static void translationArrayFor(int[] arr) {
        for (int i = 0, count = arr.length; i < arr.length; i++) {
            if (i < count) {
                int t = arr[i];
                arr[i] = arr[count - 1];
                arr[count - 1] = t;
                count--;
            }
        }
    }
    public static int indexMinRange(int[] arr, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }
    public static void sortMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = indexMinRange(arr, i+1);
            if (arr[i] > arr[index]) {
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
            }
        }
    }
    public static int indexMaxRange(int[] arr, int startIndex) {
        int index = startIndex;
        for (int i = arr.length; i > 0; i--) {
            if (arr[index] < arr[i]) {
                index = i;
                System.out.println(arr[index]);
            }
        }
        return index;
    }
    public static void sortMax(int[] arr) {
        for (int i = arr.length; i < arr.length ; i++) {
            int index = indexMaxRange(arr, i+1);
            if (arr[i] < arr[index]) {
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("In Zelle " + i + " is num " + array[i]);
        }
        //System.out.println("________");
    }

}
