public class Main {
    public static void main(String[] args) {



        int numA = 5;
        int numB = 5;

        System.out.println(sum(numA, numB, '*'));
    }
    public static int sum(int a, int b, char oper){
        int res=0;
        switch (oper){
            case '+':
                res=a+b;
                break;
            case '-':
                res=a-b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
                res=a/b;
                break;
        }
        return res;
    }
}