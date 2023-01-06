import java.util.Scanner;

public class InputNumbers {

    private Scanner sc = new Scanner(System.in);
    private final String MSG = "[%d] input integer or 0 to exit %n";

    public NumberProcessing getNumbers() {
        NumberProcessing res = new NumberProcessing();
        int num;
        int counter=1;
      do{
        System.out.printf(MSG, counter++);
        num=sc.nextInt();
        if (num!=0){
            res.add(num);
        }
        }  while (num!=0);
        return res;
    }
}