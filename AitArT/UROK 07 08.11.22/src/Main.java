public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        // 1-+
        // 2- -
        // 3- *
        // 4- /
        double res5=calculator(35,0,4);
        System.out.println("Result in main is " + res5);

    }

    public static double calculator(double a, double b, int oper){
        double result=0;
        if(oper<1 || oper>4){
            System.out.println("ERROR! 404 Wrong operation");
            result=404;
            //return result;
        }
        if(oper == 1){
            result=a+b;
            System.out.println("Result a+b is " + result);
            //return result;
        }
        if(oper == 2){
            result=a-b;
            System.out.println("Result a-b is " + result);
            //return result;
        }
        if(oper == 3){
            result=a*b;
            System.out.println("Result a*b is " + result);
            //return result;
        }
        if(oper == 4){
            if(b==0){
                System.out.println("Error 308 div by zero ");
                result=308;
                //return result;
            }
            else {
                result = a / b;
                System.out.println("Result a/b " + result);
                //return result;
            }
        }
        return result;
    }
}