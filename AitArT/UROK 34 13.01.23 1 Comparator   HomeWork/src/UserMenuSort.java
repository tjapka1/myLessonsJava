import java.util.List;
import java.util.Scanner;

public abstract class UserMenuSort {


    public static void UserMenuSort(List<Product>inputList){
        Scanner userIn =new Scanner(System.in);
        System.out.println("Введите номмер сортировки");
        System.out.println("1. Минимальная Цена");
        System.out.println("2. Максимальная Цена");
        System.out.println("3. Минимальное кличество на Складе");
        System.out.println("4. Максимальное кличество на Складе");
        byte userInput=userIn.nextByte();
        userInputCheck(inputList, userInput);

    }

    private static void userInputCheck(List<Product>inputList, byte userInput){
        boolean inputCheck=true;
        byte count=0;
        while (inputCheck){
            if (userInput ==1 || userInput==2||userInput==3||userInput==4){
                switchSort(inputList, userInput);
                break;

            }
            else if (userInput<0 || userInput >=5){
                System.out.println("Такой Функции нет!!! Введите заново.");
                System.out.println("Или 0 для выхода из Программы!");
                UserMenuSort(inputList);
                break;
            }
            else if (userInput==0) {
                System.out.println("Вы вышли из программы, Покеда!!!");
                inputCheck=false;
            }

        }


    }

    private static void switchSort(List<Product>inputList, byte userInput) {
        switch (userInput){
            case 1:
                Tools.comparSortPriceMin(inputList);
                break;
            case 2:
                Tools.comparSortPriceMax(inputList);
                break;
            case 3:
                Tools.comparSortQuanityMin(inputList);
                break;
            case 4:
                Tools.comparSortQuanityMax(inputList);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
