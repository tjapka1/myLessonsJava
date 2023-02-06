import java.util.Comparator;
import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {


        PriorityQueue<Task>tasks=new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {

                if (o1.getPriority().equals(/*"high"*/o2.getPriority()))return 1;
                /*
                if (o1.getPriority().equals("low"))return -1;
                if (o1.getPriority().equals("the boss said urgently"))return 1;
                */
                return 0;
            }

            }
        });

        tasks.add(new Task(2, "Python", "low"));
        tasks.add(new Task(1, "Java", "high"));
        tasks.add(new Task(3, "C", "the boss said urgently"));
        tasks.add(new Task(4, "Python2", "high"));


        System.out.println(tasks);
    }
}
