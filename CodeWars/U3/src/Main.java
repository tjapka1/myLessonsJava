import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


     //   System.out.println(squareDigits(9119));
        //System.out.println(squareDigits2(9119));

        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        int[] nul = new int[] {};
        System.out.println(Arrays.toString(input));
        invert(input);
        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(expected));
        invert(expected);
        System.out.println(Arrays.toString(expected));

        System.out.println(Arrays.toString(nul));
        invert(nul);
        System.out.println(Arrays.toString(nul));

    }


    public static int squareDigits(int n) {

        /*
        Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer


         */
        String reault = "";
        int res=0;
        int re=0;
        int pars=0;
        String def="";
        String vv ="";
        String num = Integer.toString(n);
                    for (int y = 0; y < num.length(); y++) {
                        def = String.valueOf(num.charAt(y));
                        pars = Integer.parseInt(def);
                        re = pars * pars;
                        String v=String.valueOf(re);
                        vv +=v;
                                            }
        res=Integer.parseInt(vv);
  return res;
    }
    public static int squareDigits2(int n) {

        /*
        Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer
         */
        String str = "";
        while (n>0){
            str= (n % 10)*(n % 10)+str;
            n/=10;
        }
        return Integer.valueOf(str);
    }
    public static int[] invert(int[] array) {
        if (array==null){
            System.out.println("nul");
        }
        for (int i = 0; i < array.length; i++) {
           array[i]*=-1;
        }
        return null;
    }


}
