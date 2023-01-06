import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {
    private String name;
    private int missedClasses;
    private double[] rate;
    private int notes;
    private double ratesNotes;
    private int capascity;
    private int size=0;



    public Student(String name, int missedClasses, int notes){
        this.name=name;
        this.missedClasses=missedClasses;
        this.notes= notes;
        this.capascity=3;
        rate=new double[capascity];
                addNote(notes);
        ratesNotes=averageGrade();
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void addNote(double notes) {
        if (size < rate.length) {
            rate[size++] = notes;
            capascity++;
        }
    }
public double averageGrade(){
        int del= rate.length;
        double res=0;
        if (rate!=null && rate.length!=0) {
            res = Arrays.stream(rate).sum() / del;
        }
        return res;
}

    public int getMissedClasses() {
        return missedClasses;

    }
    public void setMissedClasses(int missedClasses) {
        this.missedClasses = missedClasses;
    }

    public String toString() {
        DecimalFormat df= new DecimalFormat(".00");
        return   "Name - "+ name  +
                    " missedClasses=" + missedClasses +
                    " rate=" + Arrays.toString(rate) +
                    " Average Grade " + df.format(ratesNotes);
    }
}
