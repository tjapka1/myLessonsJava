public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));

        System.out.println(pow(2,10));

        System.out.println(fibonat(2));
        int[] arr={1,2,3,4,5,6,8,7};
        print(arr, 0);
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static int pow(int a, int b){
        if (b == 0){
            return 1;
        }else {
            return a*pow(a, b-1);
        }
    }
    public static int fibonat(int a){
        if (a==1||a==0) return a;
        return fibonat(a-1)+fibonat(a-2);
    }
  public static void print(int []arr, int count) {
       if (count==arr.length) {
          return;
      } else {
          System.out.println(arr[count]);
          print(arr, count+1);
      }
  }
}