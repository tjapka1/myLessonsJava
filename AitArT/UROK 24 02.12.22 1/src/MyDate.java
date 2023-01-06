public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        char ras='-';
        return addLeadZero(day) + ras + addLeadZero(month) + ras + year;
    }


    private String addLeadZero(int num) {
        return num < 10 ? "0" + num : "" + num;
    }

    public void setDay(int day) {
        this.day = day;
    }
    private int getDay(){return day;}

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
