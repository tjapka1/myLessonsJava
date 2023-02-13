import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ron", 23, 3));
        students.add(new Student("Harry", 24, 2));
        students.add(new Student("Germiona", 22, 0));
        students.add(new Student("Jinny", 21, 1));


        System.out.println(sort(students, new CompFalsDay()));
    }

    public static List<Student> sort(List<Student> inList, Comparator<Student>comparator){
        List<Student>ouList=new ArrayList<>(inList);
        ouList.sort(comparator);
        return ouList;
    }
}