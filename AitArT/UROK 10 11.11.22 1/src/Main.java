public class Main {
    public static void main(String[] args) {
        /*int a=5;
        if(a>5){
            System.out.println("A more 5");}
        else {
            System.out.println("a less or == then 5");}

        int b = 10;
        if(a>5 && b==10){
            System.out.println("A more 5 b==10" );}
        else {
            System.out.println("a less or == then 5 & b");}

        //printHello(15);
        sumDig(1232);
        printOddNum(100);
        printStars(2,5);
        malStQuere(10);*/
        forM (5050);

    }

    public static void printHello(int num) {
        int cont = 0;
        while (num != 0) {
            cont++;
            System.out.println("hello " + cont + " time");
            num--;
        }
    }

    public static int sumDig(int num) {
        int res;
        for (res = 0; num != 0; num = num / 10) {
            res = res + num % 10;
            System.out.println("aa " + res);
        }
        return res;
    }

    public static void printOddNum(int num) {
        for (int i = 1; i <= num; i += 2) {
            System.out.println(i);
        }
    }

    public static void printStars(int num, int starsInRow) {
        int i = 1;
        int j = 1;
        while (i <= num) {
            if (j < starsInRow) {
                System.out.print("*");
                j++;
            } else {
                System.out.println("*");
                j = 1;
            }
            i++;
        }

    }

    public static void malStQuere(int side) {
        int i;
        int j;
        for (i = 1; i <= side; i++) {
            for (j = 1; j <= side; j++) {
                if (i == 1 || j == 1 || i == side || j == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
public static void forM(int num){
        int i;
        for (i=0; i<num; i+=6){
            System.out.println("Sup " + i);}
}
}
