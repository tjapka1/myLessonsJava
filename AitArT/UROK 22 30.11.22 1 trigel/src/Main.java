public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 3;

        System.out.println(trigle(a,b,c));

    }
    public static boolean trigle(int a, int b, int c) {
        return !(a + b < c || b + c < a || c + a < b);
    }
}