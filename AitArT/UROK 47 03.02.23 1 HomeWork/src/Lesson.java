import java.util.Objects;

public class Lesson {
    private String lessonName;
    private int lessons;
    private int falseDays;
    private int remOfLessins;


    public Lesson(String lessonName, int lessonsCount, int falseDays) {
        this.lessonName=lessonName;
        this.lessons =lessonsCount;
        this.falseDays=falseDays;
        this.remOfLessins=remOfLessons(lessonsCount, falseDays);
    }

    private int remOfLessons(int lessonsCount, int falseDays) {
        return lessonsCount-falseDays;
    }

    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getRemOfLessins() {
        return remOfLessins;
    }

    public int getLessons() {
        return lessons;
    }


    public int getFalseDays() {
        return falseDays;
    }

    public void setFalseDays(int falseDays) {
        this.falseDays = falseDays;
    }

    public String getLessonName() {
        return lessonName;
    }


    @Override
    public String toString() {
        return lessonName + " " +remOfLessins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(lessonName, lesson.lessonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonName);
    }




}
