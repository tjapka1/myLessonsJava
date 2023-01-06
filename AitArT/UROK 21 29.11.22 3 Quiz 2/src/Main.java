import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("В каком году Европейский Союз впервые ввел евро в качестве валюты? ");
        String answer1=sc.next();
        if (answer1.equalsIgnoreCase("1999")){
            System.out.println("True");
            count++;
        }
        else {
            System.out.println("False");
            count--;
        }
        System.out.println("Какой национальный цветок Японии? ");
        String answer2=sc.next();
        if (answer2.equalsIgnoreCase("Сакура")){
            System.out.println("True");
        count++;
        }
        else {
            System.out.println("False");
        count--;
        }
        System.out.println("В 1952 году президентом какой страны был предложен Альберт Эйнштейн? ");
        String answer3=sc.next();
        if (answer3.equalsIgnoreCase("Израиль")){
            System.out.println("True");
        count++;
        }
        else {
            System.out.println("False");
        count--;
        }
        System.out.println("В какой части вашего тела вы найдете крестообразную связку?");
        String answer4=sc.next();
        if (answer4.equalsIgnoreCase("Колено")){
            System.out.println("True");
        count++;
        }
        else {
            System.out.println("False");
        count--;
        }
        System.out.println("Какой элемент обозначается химическим символом Sn в периодической таблице?");
        String answer5=sc.next();
        if (answer5.equalsIgnoreCase("Олово")){
            System.out.println("True");
        count++;
        }
        else {
            System.out.println("False");
        count--;
        }
        System.out.println("You have " + count + " Points");
        if (count<=3){
        System.out.println("Super");}
        if (count>3){
            System.out.println("No Good!! Go to Scool!!!@!Q");}


    }
}