public abstract class Worker implements DoWork {
    private String name;
    private String status;

    public Worker(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String taskMsg(String status) {
        return null;
    }

    @Override
    public String doWork(String taskMsg) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " | " +status;
    }
}