public class Main {
    public static void main(String[] args) {

        arrays();

    }

    public static void arrays(){

        int [] arr1 = new int[1000];
        printArray(arr1);
        fillArray(arr1, -100, 100);
        printArray(arr1);
        int indexResult=search(arr1, 12);
        System.out.println("Index is " + indexResult);
        int maxDig= maxDigArray(arr1);
        System.out.println("Max Dig " + maxDig);
        int maxIndDig = maxIndDigArray(arr1);
        System.out.println("Max Index " + maxIndDig);
        int minArrDig = minDigArray(arr1);
        System.out.println("Min Dig " + minArrDig);
        int minIndDig=minIndDigArray(arr1);
        System.out.println("Min Index " + minIndDig);


    }
    // - пройти по массиву, найти заданное число и вернуть его индекс i
    public static int search(int [] array, int number){
        for (int i=0; i<array.length; i++){
            if(array[i]==number){  //если текущая ячейка массива равна заданному числа
                return i;          //возвращаем индекс - ячейку в которой лежит это значение
            }
        }
        return -1;
    }
    public static void fillArray(int [] array, int min, int max){
        for (int i=0; i<array.length; i++){
            array[i]=(int)(min+Math.random()*(max+1-min));
        }
    }
    public static void printArray(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Arr ["+i+"]"+"  =   "+array[i]);
        }
        System.out.println("**********************");
    }
    public static int maxDigArray(int [] array){
        int res = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>res){
                res=array[i];
            }
        }
        return res;
    }
    public static int minDigArray(int[] array){
        int res=0;
        for (int i=0; i<array.length; i++){
            if (array[i]<res){
                res=array[i];
            }
        }
        return res;
    }
    public static int maxIndDigArray(int [] array){
        int maxInd = 0;
        for (int i=1; i<array.length; i++) {
            if (array[i]>array[maxInd]){
                maxInd=i;
            }

        }
        return maxInd;
    }
    public static int minIndDigArray(int [] array){
        // indexOfMinInArray
        // найти индекс минимального числа в массиве
        // *найти индекс минимального числа с конца

        // minDigitInArray
        // найти минимальное число в массиве
        // * нати минимальное число с конца

        // youtobe   https://www.youtube.com/watch?v=Iv3vgjM8Pv4

        int minInd=0;
        for (int i=0; i<array.length; i++){
            if (array[i]<array[minInd]){
                minInd=i;
            }
        }
        return minInd;
    }

}