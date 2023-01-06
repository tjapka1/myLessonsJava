public class Main {
    public static void main(String[] args) {
        //haharin(100);

        double resM= powXY(2,3);
        System.out.println(resM);
        int c =1493800;
        int count =countDigits(c);
        System.out.println("count " + count);
        int sumN=sumOfDigits(32);
        System.out.println(sumN);

    }

    public static int sumOfDigits(int number){
        int res=0;
        while (number!=0){
            int digit = number % 10;
            res = res + digit;
            number=number/10;
        }
        return res;

    }
    public static int countDigits(int number){
        int count=0;
        do {
            count++;
            number=number/10;
        }
        while (number != 0);
        return count;
    }


    public static double powXY(double x, int y){
        double res=1;
        int counter=1;
        while (counter<=y){
            res=res*x;
            counter++ ;
        }
        return res;
    }

   public static void haharin(int input){
        int counter = input;
        while (counter>=1){
            System.out.println(counter);
            counter --;
        }
        System.out.println("go to space");
    }

}