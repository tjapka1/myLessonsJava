public class Main {
    public static void main(String[] args) {
    arrays();
    }
    public static void arrays(){
        int [] arr = new int[5];
        arr[3]=1500;
        System.out.println(arr[3]);

        arr[1]=arr[3]/100;
        System.out.println(arr[1]);

        int arrSize=arr.length;
        System.out.println("Arr lenght = "+ arrSize);

        int [] arr2={4,6,7,8,14,25,35,46};
        System.out.println(arr2[3]);
        int arrSize2=arr2.length;
        System.out.println("Arr2 lenght = "+arrSize2);

        int i=0;
        System.out.println(arr2[i]);
        i++;
        System.out.println(arr2[i]);
        i++;
        System.out.println(arr2[i]);
        printArray(arr);
        printArray(arr2);
        int [] arr3=new int[5];
        filArray(arr3, 2, 200);
        printArray(arr3);
        printArray2(arr2);
        printArray2(arr3);
        int var=10;
        variableChance(var);
        int [] arr5 = {5, 3, 5};
        System.out.println("arr[0] befor Method " +arr5[0]);
        changeArrey(arr5);
        System.out.println("arr[0] after Method " +arr5[0]);

    }
    public static void filArray(int [] arr, int min, int max){// Метод который заполняет рандомными значениями все яйчейки массива
        for (int i=0; i<arr.length; i++){// Бежим по нашему массиву
            arr[i]=(int) (min+ Math.random()*(max*1-min));// Кладем рандомное значение в текущюю ячейку
        }

    }
    public static void printArray(int [] array){// Метод который выводит на консоль все эелементы нашего массива
        for(int i=0; i< array.length; i++){// i - Индекс запущенный в цикле от 0 до < размер массива
            System.out.print(array[i] +" ");// обращение к ячейке массива arr[i] и вывод на консоль
        }
        System.out.println();

    }
    public static void printArray2(int [] array){
        for (int i=0; i<array.length;i++){
            System.out.println("Arr" +" [" +i+"] " + " = " +array[i]);
        }
        System.out.println("Array length = " + array.length);
        System.out.println("__________");
    }
    public static void variableChance(int vari){
        vari=vari*vari;
        System.out.println("Variable in method Change " + vari);
        System.out.println("--------------");
    }
    public static void changeArrey(int [] arr){
        arr[0]=arr[0]*arr[0];
        System.out.println("arr [0] in method = " + arr[0]);
    }


}