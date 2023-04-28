public class Task {
    int number; String description; String status; int daysInProcessing;

    public Task(int number, String description, String status, int daysInProcessing) {
        this.number = number;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDaysInProcessing() {
        return daysInProcessing;
    }

    public void setDaysInProcessing(int daysInProcessing) {
        this.daysInProcessing = daysInProcessing;
    }

    @Override
    public String toString() {
        return "Task " + number +
                " " + description +
                " " + status +
                " " + daysInProcessing ;
    }
}
