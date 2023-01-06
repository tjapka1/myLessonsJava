import java.nio.channels.FileLock;

public class Main {
    public static void main(String[] args) {
        float[] arr = {5.7f, 8.1f,0.002f};

        try {
            System.out.println(arr[2]);
            int res=100/0;
        }catch (ArithmeticException e){
            System.out.println("Ощибка: " + e);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ощибка: " + e);

        }finally {
            System.out.println("Сроботал блок finally");
        }


    }
}