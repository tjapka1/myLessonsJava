import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
                                new Task(2, "Python", "not worked",3)))
        );

        List <Programmer> programmerOfMoreDays=programmers.stream()
                .flatMap(programmer -> programmer.tasks.stream())
                .filter(task -> task.daysInProcessing()>4)
                .count();

        programmerOfMoreDays.stream()
                .forEach(programmer -> System.out.println(programmer));

    }
}