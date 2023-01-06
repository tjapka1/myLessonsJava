import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Домашнее задание.
        Напишите метод calculator() типа void, внутри метода сделайте три ввода при помощи сканера.
        Чтобы пользователь вводил два числа и математический оператор.
         */
endlessCalc();

    }
    public static void endlessCalc(){
        Scanner sc = new Scanner(System.in);
        calc();
        boolean indicator=true;
        while (indicator){
            System.out.println("Noch Rechnen?    y or n");
            String answer=sc.next();
            if (answer.equalsIgnoreCase("y")){
                calc();
            }

            if (answer.equalsIgnoreCase("n")){
                indicator=false;
                System.out.println("End");
            }
        }
    }

    public static void calc() {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double result = 0;
            System.out.println("a");
            a = sc.nextDouble();
            System.out.println("Operator");
            String operator = sc.next();
            System.out.println("b");
            b = sc.nextDouble();
            switch (operator) {
                case "+":
                    result = a + b;
                    System.out.println(a + operator + b + " = " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println(a + operator + b + " = " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println(a + operator + b + " = " + result);
                    break;
                case "/":
                    if (b > 0) {
                        result = a / b;
                        System.out.println(a + operator + b + " = " + result);
                    }
                    if (b <= 0) {
                        System.out.println("Error");
                        break;
                    }
            }
        }

//        public static void print (double a, double b, double res)

    }
