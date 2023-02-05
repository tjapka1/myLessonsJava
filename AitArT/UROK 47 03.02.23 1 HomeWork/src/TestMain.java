import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestMain {
    @Test
    @DisplayName("Sort of List by Lessons")
    void lessonsSortMain(){
        List<Student> testList=List.of(
                new Student("Katja", List.of(new Lesson("Java"), new Lesson("Python"))),
                new Student("Wasja", List.of(new Lesson("Java"), new Lesson("c"))),
                new Student("Kolja", List.of(new Lesson("c++"), new Lesson("Python"))),
                new Student("Tanja", List.of(new Lesson("Java"), new Lesson("Python")))
        );
        List<Student>actualResult=Main.lessonsSort(testList, new Lesson( "Java"));
        List<Student>expectedList=List.of(
                new Student("Katja", List.of(new Lesson("Java"), new Lesson("Python"))),
                new Student("Wasja", List.of(new Lesson("Java"), new Lesson("c"))),
                new Student("Tanja", List.of(new Lesson("Java"), new Lesson("Python")))
        );
        Assertions.assertEquals(expectedList,actualResult);
    }
}
