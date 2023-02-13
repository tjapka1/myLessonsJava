import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int fallsLessons;

    public Student(String name, int age, int fallsLessons) {
        this.name = name;
        this.age = age;
        this.fallsLessons = fallsLessons;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFallsLessons() {
        return fallsLessons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && fallsLessons == student.fallsLessons && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, fallsLessons);
    }

    @Override
    public String toString() {
        return
                " " + name +
                " " + age +
                " fallsLessons=" + fallsLessons;
    }
}
