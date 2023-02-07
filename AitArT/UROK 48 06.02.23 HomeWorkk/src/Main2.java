import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {


        PriorityQueue<Task> tasks = new PriorityQueue<>(/*new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {

                if (o1.getPriority("high") && o2.getPriority("high")) {
                    return 0;
                } else if (o1.getPriority("low")) {
                    return -1;
                } else if (o1.getPriority("the boss said urgently")) {
                    return 1;
                }
            }
        }*/);

        tasks.offer(new Task(2, "Python", "low"));
        tasks.offer(new Task(1, "Java", "high"));
        tasks.offer(new Task(3, "C", "the boss said urgently"));
        tasks.offer(new Task(4, "Python2", "high"));


        while (tasks.size() > 0) {
            System.out.println(tasks.poll());
        }
    }
}
