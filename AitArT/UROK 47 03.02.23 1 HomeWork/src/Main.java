import java.util.*;

public class Main {
    /*
    Дан список студентов группы. Дан список занятий Lesson {int num, String theme, List<Student> students}
     т.е. номер занятия, тема и  список присутствующих студентов.
    Необходимо получить список занятий, где количество прогульщиков было больше заданного числа
    Необходимо получить список “прогульщиков” отсортированный по количеству прогулов
.
Дано два списка Student-ов. Необходимо определить,
является ли один список циклической перестановкой другого.
Например
list1{s1,s2,s3,s4,s5},  list2{s3,s4,s5,s1,s2} ->true
list1{s1,s2,s3,s4,s5},  list2{s2,s4,s5,s1,s3} ->false
Решить задачу всеми известными вам способами.


     */

    public static void main(String[] args) {
        List<Student>studentList=List.of(
                new Student("Katja", List.of(
                        new Lesson("Java", 99, 5),
                        new Lesson("Python", 100,8))),
                new Student("Wasja", List.of(
                        new Lesson("Java", 99, 20),
                        new Lesson("C", 120, 30))),
                new Student("Kolja", List.of(
                        new Lesson("C++", 115, 1),
                        new Lesson("Python", 100, 5))),
                new Student("Tanja", List.of(
                        new Lesson("Java", 99, 8),
                        new Lesson("Python", 100,9))),
                new Student("Katja", List.of(
                        new Lesson("Java", 99, 4),
                        new Lesson("Python", 100,5)))

                );
        //lessons(studentList, "Java");
        lessonsOf(studentList,1);


    }
    public static void lessons(List<Student> inList, String lessons){
        List<Student> ouList=lessonsSort(inList, new Lesson(lessons));
        //List<Student> sortedList=sortStudent(ouList);
        Map<Student, Integer> falseDay=sortMap(ouList);
        printStudent(falseDay);
     }
    public static void lessonsOf(List<Student> inList, int shotLessons){
        List<StudentsFallsDay> ouList= shotLesons(inList, shotLessons);
        
    }

    private static List<StudentsFallsDay> shotLesons(List<Student> inList, int shotLessons) {
        List<StudentsFallsDay>ouList=new ArrayList<>();
        for (Student student:inList){
            if (student.getLesson().get(0).getFalseDays()>=shotLessons){
            ouList.add(new StudentsFallsDay(student.getName(), student.getLesson().get(0), student.getLesson().get(0).getFalseDays()));
            ouList.add(new StudentsFallsDay(student.getName(), student.getLesson().get(1), student.getLesson().get(0).getFalseDays()));
            }
        }
        printList(ouList);
        return ouList;
    }

    private static Map<Lesson, Integer> allSortMap(List<Lesson> inList) {
        Map<Lesson, Integer> ouMap=new HashMap<>();
        for (Lesson s: inList){
            ouMap.put(s, s.getRemOfLessins());
        }
        return ouMap;

    }

    private static List<Student> sortStudent(List<Student> inList) {
        Set<Student>ouSet=new TreeSet<>();
            for (Student student:inList){
                ouSet.add(student);
            }
        return new ArrayList<>( ouSet);
    }
    public static List<Student>lessonsSort(List<Student> inList,Lesson lesson ){
        List<Student>ouList=new ArrayList<>();
        for (Student student:inList){
            if (student.getLesson().contains(lesson)){
                ouList.add(student);
            }
        }
        return ouList;
    }
    private static Map<Student, Integer> sortMap(List<Student> inList) {
        Map<Student, Integer> ouMap=new HashMap<>();
        for (Student s: inList){
            ouMap.put(s, s.getLesson().get(0).getFalseDays());
        }
        return ouMap;
    }
    public static void printStudent(Map<Student, Integer> inMap) {
        Set<Map.Entry<Student, Integer>> entries = inMap.entrySet();
        for (Map.Entry<Student, Integer> p : entries)
            System.out.println(p.getKey() + " " + p.getValue());
    }
    public static void printLesons(Map<Lesson, Integer> inMap) {
        Set<Map.Entry<Lesson, Integer>> entries = inMap.entrySet();
        for (Map.Entry<Lesson, Integer> p : entries)
            System.out.println(p.getKey() + " " + p.getValue());
    }
    public static void printList(List<StudentsFallsDay>inList){
        for (StudentsFallsDay student:inList){
            System.out.println(student);
        }
    }

}