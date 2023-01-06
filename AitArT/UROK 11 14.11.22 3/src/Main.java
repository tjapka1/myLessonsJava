public class Main {
    public static void main(String[] args) {

        String[] patients = new String[20];
        System.out.println(patients[0]);

        for (int i = 0; i <= patients.length; i++) {
            patients[i] = "patients " + (i + 1);
            System.out.println(patients[i]);
        }

    }
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