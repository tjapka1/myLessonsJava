public class Main {
    public static void main(String[] args) {
       /* haranin();
        System.out.println("sum Dig " + sumOfDig(66));
        System.out.println("Pow dig " + powXY(2,5));

        */
        pifogot();
    }
    public static void haranin(){
        for( int count=10 ; count>0; count--){
            System.out.println(count);
        }
        System.out.println("Стартуем");
    }
    public static int sumOfDig(int number){
        int res;
        for (res=0; number!=0; number/=10){
            int dig =number %10;
            res =res+dig;
        }
        return res;
    }
    public static int powXY(int x, int y){
        int res=1;
        for (int i=1; i<=y; i++){
            res=res*x;
        }
        return res;
    }
    public static void pifogot(){
        for(int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }


}