package de.ait.Tools;

public class ArrayTools {

    //___________fill__________________
    public static void fillArray(int array[], int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
    //___________Print____________________
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arr [" + i + "]" + "=" + array[i]);
        }
        System.out.println("_____________");
    }
    //____________Sort________________
    public static void selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = indexMinRange(arr, i + 1);
            if (arr[i] > arr[index]) {
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
            }
        }
    }
    public static boolean bubble(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                flag = true;
            }
        }
        return flag;
    }
    public static void bubbleSort1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[i];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //____________Search_________________
    public static int search(int [] array, int number){
        for (int i=0; i<array.length; i++){
            if(array[i]==number){  //если текущая ячейка массива равна заданному числа
                return i;          //возвращаем индекс - ячейку в которой лежит это значение
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static int findIndexOfWord(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                System.out.println(target);
                return i;
            }
        }
        return -1;
    }
    //_____________Max/Min_____________________________
    public static int indexMinRange(int[] arr, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }

        }
        return index;
    }
    public static int maxDigArray(int [] array){
        int maxDig = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>maxDig){
                maxDig=array[i];
            }
        }
        //       System.out.println("Max Digids = "+ maxDig);
        return maxDig;
    }
    public static int minDigArray(int[] array){
        int minDig= 0;
        for (int i=0; i<array.length; i++){
            if (array[i]<minDig){
                minDig=array[i];
            }
        }
        //     System.out.println("Min Digids = "+ minDig);
        return minDig;
    }
    public static int maxIndDigArray(int [] array){
        int maxInd = 0;
        for (int i=1; i<array.length; i++) {
            if (array[i]>array[maxInd]){
                maxInd=i;
            }

        }
        //     System.out.println("Max Index of Digids = "+ maxInd);
        return maxInd;
    }
    public static int minIndDigArray(int [] array){
        int minInd=0;
        for (int i=0; i<array.length; i++){
            if (array[i]<array[minInd]){
                minInd=i;
            }
        }
        // System.out.println("Min Index of Digids = "+ minInd);
        return minInd;
    }
}