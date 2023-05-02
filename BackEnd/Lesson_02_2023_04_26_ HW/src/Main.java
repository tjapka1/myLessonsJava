import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    /*

Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач
Task (int Number, String description, String status, int daysInProcessing) .
Используя Stream сформировать лист из 5 задач которые дольше всего находятся в работе.

Дана строка вида ключ1:значение1;ключ2:значение2;ключ1:значение2;ключ3:значение1 .....
Написать метод, который возвращает последнее значение заданного ключа.
Например: "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3", "Jack" -> "room 1"
Если в строке нет заданного ключа возвращается пустая строка.

     */
        List <Programmer> programmers=List.of(
                new Programmer("Vasja", "Berlin", List.of(
                                            new Task(1, "Java", "worked",5))),
                new Programmer("Kolja", "Dortmund", List.of(
                                            new Task(2, "Python", "not worked",3))),
                new Programmer("Pr.1", "Berlin", List.of(
                                            new Task(8, "testing", "in process", 2 ))),
                new Programmer("Pr.2", "Oslo", List.of(
                                            new Task(3, "tests coding", "finished", 5 ))),
                new Programmer("Pr.3", "Munich", List.of(
                                            new Task(1, "app develop", "in process", 30 ))),
                new Programmer("Pr.4", "Berlin", List.of(
                                            new Task(2, "updating", "finished", 2 ))),
                new Programmer("Pr.5", "Dubai", List.of(
                                            new Task(4, "data analise", "finished", 7 ))),
                new Programmer("Pr.6", "Hamburg", List.of(
                                            new Task(5, "visualisation", "in process", 15 ))),
                new Programmer("Pr.7", "Tallinn", List.of(
                                            new Task(6, "testing", "failed", 9 )))
        );

        List programmerOfMoreDays=programmers.stream()
                .flatMap(programmer -> programmer.getTasks().stream() )
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing))
                .limit(5)
                .toList();

        programmerOfMoreDays
                .forEach(System.out::println);


       String t = "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3";

    }
    public static String valueFromString(String string, String key) {
        if(string==null || key==null) return "";
        return Arrays.stream(string.split(";"))
                .filter(s -> s.startsWith(key + ":"))
                .reduce((acc, s) -> s.substring(s.indexOf(':') + 1))
                .orElse("");
    }

}