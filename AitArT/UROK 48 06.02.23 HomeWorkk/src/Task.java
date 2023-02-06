public class Task implements Comparable{
    private  int num;
    private String title;
    private String priority;

    public Task(int num, String title, String priority) {
        this.num = num;
        this.title = title;
        this.priority = priority;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return num +
                " " + title +
                " " + priority;
    }

}
