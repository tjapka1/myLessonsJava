import java.util.Comparator;

public class CompFalsDay implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getFallsLessons()-o1.getFallsLessons();
    }
}
