public class Main {
    public static void main(String[] args) {
//        urok();
//        pets();
//        patient();
//       homeWork1();
      homeWork2();


    }

    public static void urok() {      // создали массивы
        int[] myNumbers = {6, 7, 8, 9, 10, 11};
        // .length - чтобы узнать длину массива
        System.out.println("Длина массива: " + myNumbers.length);
        // печатаем второй элемент массива (с индексом 1)
        System.out.println("Элемент под индексом 1: " + myNumbers[1]);

        System.out.println("Элемент с индексом 2 до: " + myNumbers[2]);
        // присвоить новое значение элементу массива под индексом 2
        myNumbers[2] = 22;
        System.out.println("Элемент с индексом 2 после: " + myNumbers[2]);
        int[] friends15 = new int[15]; // создали новый массив, но что в нем лежит?
        System.out.println("Что лежит в массиве по умолчанию? " + friends15[0]);
        //System.out.println(friends15);
        System.out.println("__________________");
        String[] fruits = {"apple", "orange", "mango", "lemon", "bannana"};
        // напишите цикл - который выводит значния массива в печать
        // вам поможет длинна массива - ее можно получить fruits.length
        // здесь пишите фор
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " " + i);
        }

        // выведем в обратном порядке тот же самый массив
        System.out.println("_____");
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i] + " " + i);
        }
        // выведем без первого и последнего
        System.out.println("_____");
        for (int i = 1; i < fruits.length - 1; i++) {
            System.out.println(fruits[i] + " " + i);
        }
        System.out.println("______________________");
    }

    public static void showNum1() {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void pets() {
        //    Создайте массив из всех чётных чисел от 2 до 20
//    и выведите элементы массива на экран,
//    Перед созданием массива подумайте, какого он будет размера.
//        2
//        4
//        6
//        …
//        20

        // ПОДСКАЗКИ
// сначала напишите просто цикл  - который бы выводил бы эти числа в консоль
// посчитайте сколько чисел было в массиве
// (сделайте переменную которая увеличивалась бы в цикле, ее нужно создать до цикла
// создайте массив длинной равный этой переменной  int[] name = new int[count];
// и запишите в него значения, используя еще один массив


        int count = 0;
        for (int i = 2; i <= 20; i += 2) {

            count++;
        }
        System.out.println("We have " + count + " elements");
        int[] myNumbers = new int[count];
        // System.out.println(myNumbers.length);
        //System.out.println(myNumbers[7]); // сейчас у нас есть массив из нулей с длинной 10

        System.out.println("___welche____"); // записываем значения
        int index = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
//                System.out.print(index + " ");
//                System.out.println(i);
                myNumbers[index] = i; // здесь должно быть все ок
                System.out.println(myNumbers[index]); // вывели значение в консоль
                index++;
            }
        }
        System.out.println("_______final_______"); // еще раз выведем в консоль

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[myNumbers.length + i]);
        }

    }

    public static void patient() {
        String[] patients = new String[20];
        System.out.println(patients[0]);

        for (int i = 0; i <= patients.length; i++) {
            patients[i] = "patients " + (i + 1);
            System.out.println(patients[i]);
        }
    }

    public static void homeWork1() {
       /*
### Задание 1

Создайте массив нечетных чисел от 1 до 97.
После создания выведите все элементы массива в консоль.
После чего выведите этот же массив, но в обратном порядке.*/
        int a=97;


        int count = 0; // эта переменная покажет нам сколько будет элементов у будущего массива
        for (int i = 1; i <= a; i+=2) {
//            System.out.println(i); // мы делали для себя - чтобы посмотреть
            count++; // каждый раз увеливаем на единицу
        }
//        System.out.println(count);  мы посмотерли что получилось

        int[] oddNumbers = new int[count]; // создали массив - она зполнен нулями
        int index = 0;
        for(int i = 1; i <= a; i++) {
            if (i % 2 != 0 ) {
                // в этой строке мы не печатаем значения массива - мы печатем переменную i
//                System.out.println(i); // это мы писали, чтобы самим посмотреть каие значения у нас есть
                // на каждой итерации записываются данные в массив
                // мы записываем по индексу в ячейку
                oddNumbers[index] = i;
                // мы распечатать то, что у нас лежит в массиве по индексу
//                System.out.println(oddNumbers[index]);
                index++;
            }
        }

        // отдельно выведем весь массив в печать
        for(int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }
        System.out.println("________________");
        // отдельно выведем массив в обратном порядке // мы не будем менять сам массив


        for(int i = oddNumbers.length-1; i >= 0; i--){
            System.out.println(oddNumbers[i]);
        }
//        int[] special = {3, 7, 8, 10};  // объяснение почему length -1
//        System.out.println(special.length);
//        System.out.println(special[special.length-1]);

// ### Задание 1
//
//        Создайте массив нечетных чисел от 1 до 97.
//        После создания выведите все элементы массива в консоль.
//        После чего выведите этот же массив, но в обратном порядке.

    }

    public static void homeWork2() {

/*### Задание 2

Создайте массив из строк (String), выведите его в консоль.
Элементы массив сделайте по образцу: {"Step 75", "Step 74", "Step 73",..., "Step 10", "Step 9"}
(Числа от 75 до 9 включительно).*/
      int a=75;
      int count=0;
      int index =0;
      for(int i=0; i<=a; i++){
          //System.out.println(i);
          count++;
      }
      int [] stepM=new int[count];
      for(int i=0; i<=a; i++){
          stepM[index] = i;
      //    System.out.println(stepM[index]);
          index++;
      }


    for (int i=stepM.length-1; i>=0; i--){
        if(i >=9){
        //System.out.println("Arr" +" [" +i+"] " + " = " +stepM[i]);
            System.out.println("Step " +stepM[i]);
    }}
        System.out.println("Array length = " + stepM.length);
        System.out.println("__________");






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