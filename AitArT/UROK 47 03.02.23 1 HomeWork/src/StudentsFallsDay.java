public class StudentsFallsDay {
    private String name;
    private Lesson lesson;
    private int fallsDay;

    public StudentsFallsDay(String name, Lesson lesson, int fallsDay) {
        this.name = name;
        this.lesson = lesson;
        this.fallsDay = fallsDay;
    }

    @Override
    public String toString() {
        return "StudentsFallsDay{" +
                "name='" + name + '\'' +
                ", lesson=" + lesson +
                ", fallsDay=" + fallsDay +
                '}';
    }
}
