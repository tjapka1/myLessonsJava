import java.util.Comparator;

public class SortByFalseDayComp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getLesson().get(0).getFalseDays()-o1.getLesson().get(0).getFalseDays();
    }
}
