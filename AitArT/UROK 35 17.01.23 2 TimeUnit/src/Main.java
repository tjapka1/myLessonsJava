import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int LIMIT = 10_000;
    private static final Random RND=new Random();
    private static long start;
    private static long finish;


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        startTimer();
        //addNumbers(list);
        addNumbersToRndPosition(list);
        //addNumbersToRndPosition2(list);
        stopTimer();
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());

    }


    public static void startTimer(){
        start= System.nanoTime();
    }

    public static void stopTimer(){
        finish= System.nanoTime();
    }
    public static long getTimer(){
        long time = finish-start;
        return TimeUnit.MILLISECONDS.convert(time,TimeUnit.NANOSECONDS);
    }
    public static void addNumbers(List<Integer> list){
        for (int i = 0; i < LIMIT; i++) {
            list.add(i);
        }
    }
    public static void addNumbersToRndPosition(List<Integer> list){
        list.add(RND.nextInt());
        for (int i = 0; i < LIMIT; i++) {
            list.add(RND.nextInt(list.size()), RND.nextInt());
        }
    }
    public static void addNumbersToRndPosition2(List<Integer> list){

        List<Integer> arr = new ArrayList<>(LIMIT);

            for (int i = 0; i < LIMIT;  i++) {
                arr.add(i, i);
                list.add(null);
            }

            for (int i = 0; i < LIMIT;  i++) {
                int rndIdx = RND.nextInt(LIMIT - i);
                int rndFromList = list.remove(rndIdx);
                list.set(rndFromList, RND.nextInt());
            }

        }
}