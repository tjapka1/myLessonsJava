public class Main {
    public static void main(String[] args) {

        int first =154;
        int second =240;

        int prob = posDif(first, second);
        if(prob== 10 || prob == 30){
            System.out.println("Hurra");
        }
        else{
            System.out.println("neh");
        }
    }
    public static int posDif(int a, int b) {
        if (a>b){
            return a-b;
        }
        else {
            return b-a;
        }
    }
}