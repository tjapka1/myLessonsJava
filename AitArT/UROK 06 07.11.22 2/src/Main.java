public class Main {
    public static void main(String[] args){


        // height = 160 ->
        // (==) равно
        // (>) больше
        // (<) меньше
        // (>=) больше либо равно
        // (<=) меньше либо равно
        // (!=) не равно
        // (||) or или  Наш рост >160 cm или <180 см
        // (&&) and и Наш рост 160cm и вес 86 кг

        double x = 12;
        double y = 32;
        double resm = max(x, y);
        System.out.println(resm);

        double a = 12;
        double b = 32;
        double remi = min(a, b);
        System.out.println("min " + remi);

        heightm(168);

    }
    public static double max(double x, double y){
        double res = 0;
        if (x>y){
            res = x;
        }
    else{
        res = y;
        }
    return res;
    }

    public static double min(double a, double b){
        double resm = 0;
        if (a<b){
            resm = a;
        }
        else{
            resm = b;
        }
        return resm;
    }

    public static   void heightm(int height){
        if (height<0){
            System.out.println("Pls check ");
        }
        if (height>0 && height<120){
            System.out.println("Go Home");
        }
        if (height>120 && height<=140){
            System.out.println("Go to walk");
        }
        if (height>140 && height<180){
            System.out.println("Go to NBa");
        }
       if (height>181) {
           System.out.println("You are alien!!!");
       }

    }
}
