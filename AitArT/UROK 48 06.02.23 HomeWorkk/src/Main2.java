public class Main2 {
    public static void main(String[] args) {


        TaskQueue tasks = new TaskQueue();

        tasks.offer(new Task("Python", "low"));
        tasks.offer(new Task( "Java", "high"));
        tasks.offer(new Task( "C", "the boss said urgently"));
        tasks.offer(new Task( "Python2", "high"));



        System.out.println(tasks);
        }
    }

