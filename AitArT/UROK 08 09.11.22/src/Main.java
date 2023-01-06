public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 7;
        int c = 20;
        int result = rech(a, b, c);
        System.out.println(result);
    }

    public static int rech(int a, int b, int c) {
       int count=0;
       if (a > 0) {
            count = +1;
        }
        if (b > 0) {
            count = +1;
        }
        if (c > 0) {
            count = +1;
        }
        return count;
    }

}