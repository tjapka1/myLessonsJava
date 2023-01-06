package deAit.Modes;

public class Magazin {
    private String name;
    private int pages;
    private int copy;

    public String toString() {
        return "Magazin{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", copy=" + copy +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setCopy(int copy) {
        this.copy = copy;
    }
    public void setYear(int year) {
        this.year = year;
    }
    private int year;
    public String getName() {
        return name;
    }
    public int getPages() {
        return pages;
    }
    public int getCopy() {
        return copy;
    }
    public int getYear() {
        return year;
    }
    public Magazin(String name, int pages, int copy, int year) {
        this.name = name;
        this.pages = pages;
        this.copy = copy;
        this.year = year;
    }
}
