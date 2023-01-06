import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) {

        calc();

    }


    public static void calc() {
        Scanner sc = new Scanner(System.in);
        int punkt = 0;
        int countGame = 1;
        int countLevels = 1;
        int countGameOver = 3;
        double result = 0;
        boolean game = true;

        while (game) {
            char[] operatop1 = {'+', '-'};
            char[] operatop2 = {'+', '-', '*', };
            char[] operatop3 = { '+', '-', '*','/'};


            int maxOper1 = 1;
            int minOper1 = 0;
            int operRan1 = (int) (minOper1 + Math.random() * (maxOper1 - minOper1 + 1));
            char oper1 = operatop1[operRan1];

            int maxOper2 = 2;
            int minOper2 = 0;
            int operRan2 = (int) (minOper2 + Math.random() * (maxOper2 - minOper2 + 1));
            char oper2 = operatop2[operRan2];

            int maxOper3 = 3;
            int minOper3 = 0;
            int operRan3 = (int) (minOper3 + Math.random() * (maxOper3 - minOper3 + 1));
            char oper3 = operatop3[operRan3];

            int maxDig1 = 10;
            int minDig1 = 1;
            if (countLevels==4){maxDig1=50;}
            if (countLevels==7){maxDig1=100;}
            if (countLevels==10){maxDig1=1000;}
            double digA1 = (int) (minDig1 + Math.random() * (maxDig1 - minDig1 + 1));
            double digA2 = (int) (minDig1 + Math.random() * (maxDig1 - minDig1 + 1));


            char operMode=oper1;                                    //1-10
            if (countLevels==2){operMode=oper2;}
            if (countLevels==3){operMode=oper3;}
            if (countLevels==4){operMode=oper1;}        //1-50
            if (countLevels==5){operMode=oper2;}
            if (countLevels==6){operMode=oper3;}
            if (countLevels==7){operMode=oper1;}        //1-100
            if (countLevels==8){operMode=oper2;}
            if (countLevels==9){operMode=oper3;}
            if (countLevels==10){operMode=oper1;}        //1-1000
            if (countLevels==11){operMode=oper2;}
            if (countLevels==12){operMode=oper3;}

            char x='/';
            switch (operMode) {
                case '+':
                    result = digA1 + digA2;
                    System.out.print(digA1 + " ");
                    System.out.print(operMode + " ");
                    System.out.print(digA2 + " ");
                    System.out.print(" = ");
                    break;
                case '-':
                    result = digA1 - digA2;
                    System.out.print(digA1 + " ");
                    System.out.print(operMode + " ");
                    System.out.print(digA2 + " ");
                    System.out.print(" = ");
                    break;
                case '*':
                    result = digA1 * digA2;
                    System.out.print(digA1 + " ");
                    System.out.print(operMode + " ");
                    System.out.print(digA2 + " ");
                    System.out.print(" = ");

                    break;
                case '/':
                    if (digA2 > 0) {
                        result = digA1 / digA2;
                        System.out.print(digA1 + " ");
                        System.out.print(x + " ");
                        System.out.print(digA2 + " ");
                        System.out.print(" = ");
                        result=Math.round(result*100)/100.00;

                    }
                    /*if (dig2 <= 0) {
                        System.out.println("Error");
                        break;
                    }*/
            }

            System.out.print(" ");

            double entResulgt = sc.nextDouble();
            if (entResulgt == result) {
                System.out.println("True");
                punkt++;
                System.out.println("You have " + punkt + " Points " + countGameOver + " Lives");

            } else {
                System.out.println("False");
                countGameOver--;
                System.out.println("You have " + countGameOver + " Lives");
                System.out.println("Correct Result is " + result);

            }
            if (countGameOver == 0) {
                System.out.println("You Game Over");
                System.out.println("All your points is " +punkt);
                game = false;
            }
            countGame++;
            if (countGame==16){countLevels++; countGame=1;}
            System.out.println("gm " + countGame + " Lv "+countLevels);

            //Timer

        }

    }


}
