import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*
1:
Дан список Account{Person person, String iban, double balance}. Необходимо сформировать Map<Person, Account>,
где ключом будет Person, а значением список его счетов.

2:
Дан список Person(name,age) необходимо написать метод, который возвращает Map<Person,Integer>,
где ключ это сам Person, а значение – сколько раз он встретился в списке.
И чуть сложнее

3:
Допустим, Вы пишите программу для отображения статистики по играм НХЛ (привет Алексею 😀 ).
Допустим, у вас есть объект GameInfo {String team1, String team2, int goalsTeam1, int goalsTeam2} (соответственно,
goalsTeam1 – количество голов забитых командой Team1). Естественно дан список таких объектов.
Необходимо получить Map, где ключом будет название команды, а значением, количество забитых голов.
Попробуйте самостоятельно, если совсем не получается – подсказка.

     */
    public static void main(String[] args) {

        List <Account> accounts=List.of(
                new Account(new Person("p1"), "DE01", 10),
                new Account(new Person("p2"), "DE02", 20),
                new Account(new Person("p2"), "DE02", 20),
                new Account(new Person("p3"), "DE03", 30),
                new Account(new Person("p4"), "DE04", 40),
                new Account(new Person("p5"), "DE05", 50)
        );

        Map<Person, List <Account>> nameAcc= accounts.stream()
                .collect(Collectors.groupingBy(account -> account.getPerson()));

        System.out.println(nameAcc);
        System.out.println("**************************");

        List <Person> people=List.of(
                new Person("Wasja1", 10),
                new Person("Wasja2", 20),
                new Person("Wasja1", 10),
                new Person("Wasja4", 40),
                new Person("Wasja4", 40),
                new Person("Wasja4", 40),
                new Person("Wasja5", 50),
                new Person("Wasja5", 50),
                new Person("Wasja5", 50),
                new Person("Wasja5", 50),
                new Person("Wasja5", 50)
        );


        Map <Person, Long> personCount = people.stream()
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(personCount);
        System.out.println("**************************");

        List<GameInfo> gameInfos=List.of(
                new GameInfo("t01", "t02", 5,4),
                new GameInfo("t11", "t12", 4,2),
                new GameInfo("t01", "t11", 2,3),
                new GameInfo("t02", "t12", 4,5),
                new GameInfo("t12", "t01", 3,6)
        );
        System.out.println(gameInfos);

        Map<String, Integer>  team1GoalsMap = gameInfos.stream()
                .collect(Collectors.toMap(GameInfo::getTeam1, GameInfo::getGoalsTeam1, Integer::sum));
        Map<String, Integer> team2GoalsMap = gameInfos.stream()
                .collect(Collectors.toMap(GameInfo::getTeam2, GameInfo::getGoalsTeam2, Integer::sum));

        Map<String, Integer> allTeamsGoals = new HashMap<>();
        allTeamsGoals.putAll(team1GoalsMap);
        allTeamsGoals.putAll(team2GoalsMap);

        System.out.println(allTeamsGoals);
    }
}