import java.util.List;
import java.util.Objects;

/*
Дан список студентов группы. Дан список занятий Lesson {int num, String theme, List<Student> students}  т.е. номер занятия, тема и  список присутствующих студентов.
Необходимо получить список занятий, где количество прогульщиков было больше заданного числа
 Необходимо получить список “прогульщиков” отсортированный по количеству прогулов
.
Дано два списка Student-ов. Необходимо определить, является ли один список циклической перестановкой другого. Например
	list1{s1,s2,s3,s4,s5},  list2{s3,s4,s5,s1,s2} ->true
list1{s1,s2,s3,s4,s5},  list2{s2,s4,s5,s1,s3} ->false
Решить задачу всеми известными вам способами.


 */
public class Student {
private String name;

private List <Lesson> lesson;

    public Student(String name, List <Lesson> lessons) {
        this.name = name;
        this.lesson = lessons;
    }

    public String getName() {
        return name;
    }

    public List<Lesson> getLesson() {
        return lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(lesson, student.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lesson);
    }

    @Override
    public String toString() {
        return name /*+" "+  */;
    }
}
