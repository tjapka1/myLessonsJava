import java.util.Scanner;

public class MenuSelectedMailService {

    Scanner sc = new Scanner(System.in);
    private MailDeliveryService[] services;

    public MenuSelectedMailService(MailDeliveryService[] services) {
        this.services = services;
    }

    public MailDeliveryService select() {
        System.out.println("Введите номер способа отправки Писма");
        for (int i = 0; i < services.length; i++) {
            System.out.println(i + ". | " + services[i].name());
        }
        byte userOut = checkInputUserData(userInput(), services);
        return services[userOut];
    }

    private static byte userInput() {
        Scanner sc = new Scanner(System.in);
        byte userIn = sc.nextByte();
        return userIn;

    }

    private static byte checkInputUserData(byte userIn, MailDeliveryService[] services) {
        boolean checkFlag = true;
        int checkCount = 0;
        byte userOut = 0;
        for (int i = 0; i < services.length; i++) {
            while (checkFlag) {
                //if (userIn == 1 || userIn == 2 || userIn == 3) {
                if (userIn == 2) {
                    userOut = userIn;
                    return userOut;
                } else {
                    //Почему каунтер только 1 раз срабатывает??????????
                    checkCount++;
                    System.out.println("Вы ввели не правильную Функцию");
                    System.out.println("Count" + checkCount);

                    if (checkCount == 5) {
                        System.out.println("Вы ввели 5 раз не Правильно");
                        System.out.println("Программа закрываеться, ПОКЕДА");
                        break;
                    }
                    userInput();
                    checkFlag = false;
                }

            }




        }
        return -1;

    }
}
