import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte num=10;
        switch (num){
            case 1:
                System.out.println("Пер равнаа 1");
                break;
            case 23:
                System.out.println("Пер равнаа 23");
                break;
            case 100:
                System.out.println("Пер равнаа 100");
                break;
            case 89:
                System.out.println("Пер равнаа 89");
                break;
            default:
                System.out.println("Пер равна чему-то другому");
        }

        short x=3 , a=12;
        int res= x<a? (x+a):(x-a);
        System.out.println(res);

        Scanner sc=new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age=sc.nextInt();

        boolean withParents= sc.nextBoolean();
        if (age<18){
            if (age>10 && age<=15 && withParents) System.out.println("Вам сейчас от 10 до 15 лет и вы с родителями");
            else if ((age==7 || age==9) && !withParents) System.out.println("Вам вход бесплатный");
        }
        else if (age==18){
            System.out.println("Вам уже 18 лет");}
        else if (age==19){
            System.out.println("Вам уже 19 лет");}
        else {
            if (age>=50){
                System.out.println("Вам уже 50 лет");}
            else {
                System.out.println("Вам меньше 50 лет");}

        }



    }
}