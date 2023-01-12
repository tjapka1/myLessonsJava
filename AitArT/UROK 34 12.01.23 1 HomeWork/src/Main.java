import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Предположим, ваша программа предоставляет пользователю возможность
        отослать письмо одним из 3 возможных способов: DHL, E-Mail, Owl.
        Вам необходимо реализовать один общий метод отправки почты,
        который в качестве параметра получает способ отправки почты.
        Реализация каждого из способов, должна быть выполнена отдельным
        методом (каждый метод может просто выводить на экран соответствующее
        сообщения, например, в случае DHL, что то типа: «кладу письмо в конверт,
        клею марку, иду на  почту»). Выбор способа отправки определяется
        gользователем, например через Scanner

        Кто не знает что делать, подсказка на следующей странице:
         */



        System.out.println("Введите номер способа отправки Писма");
        userInput();

    }
    private static void userInput(){
        System.out.println("1 . Dhl    2 . Email    3 OWL");
        Scanner sc=new Scanner(System.in);
        byte userIn=sc.nextByte();
        checkInputUserData(userIn);
    }
    private static void checkInputUserData(byte userIn ){
        boolean checkFlag=true;
       int count=0;
        while (checkFlag) {
            if (userIn == 1 || userIn ==2 || userIn==3) {
                selectFunction(userIn);
                checkFlag = true;
                break;
            }else if (userIn==0){
                System.out.println("Вы вышли");
                break;
            }else {
                //Почему каунтер только 1 раз срабатывает??????????

                count++;

                System.out.println("Вы ввели не правильную Функцию");
                System.out.println("Или 0 для выхода из Программы ");

                System.out.println("Count" + count);
                userInput();

                if (count==5){
                    System.out.println("Вы ввели 5 раз не Правильно");
                    System.out.println("Программа закрываеться, ПОКЕДА");
                    break;}
                checkFlag = false;}

            }
        }
    private static void selectFunction(byte userIn){
            Send dhl =new Dhl();
            Send email=new EMail();
            Send owl = new Owl();
            switch (userIn){
                case 1:
                    System.out.println("Dhl");
                    dhl.send();
                    break;
                case 2:
                    System.out.println("Email");
                    email.send();
                    break;
                case 3:
                    System.out.println("OWl");
                    owl.send();
                    break;
                default:
                    System.out.println("Error");
            }

        }



    }
