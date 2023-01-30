import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
Дан List<String> содержащий какой то текст.
Необходимо получить список из 10 самых часто
встречающихся слов из этого текста.*

*В контексте данной задачи все слова разделены
1 пробелом и текст не содержит знаков препинания.
 Для тех, кому чуть сложнее, можете решить используя реальный текст,
 содержащий знаки препинания.


 Андрей , вопросы по ДЗ. Если говорить о реальном тексте,
 считать ли содержащиеся в нем числа словами?
 Можем ли мы ограничится пунктуацией Английского языка?

считать ли содержащиеся в нем числа словами?
с точки зрения алгоритма решения задачи это +\- без разницы.
Можем ли мы ограничится пунктуацией Английского языка
Да, можно ограничить рамки задачи англоязычным текстом.

Коллеги, задача с "реальным текстом" носит факультативный характер.

         */

        String text = "Дан List<String> содержащий какой то текст.\n" +
                "Необходимо получить список из 10 самых часто\n" +
                "встречающихся слов из этого текста.*\n" +
                "\n" +
                "*В контексте данной задачи все слова разделены\n" +
                "1 пробелом и текст не содержит знаков препинания.\n" +
                " Для тех, кому чуть сложнее, можете решить используя реальный текст,\n" +
                " содержащий знаки препинания.";


        stringToCount(text);

        List<String> words = new ArrayList<>();
        words.add("da");
        words.add("ja");
        words.add("da");
        words.add("ne");
        words.add("da");
        words.add("ja");
    }
    public static void stringToCount(String inStr){
        List<String> strToList = textStringToList(inStr);
        Map<String,Long>listToMap=wordsCount(strToList);

    }
    public static List<String> textStringToList(String inStr) {
        List<String> outList = new ArrayList<>();
        for (String s : inStr.split(" ")) {
            outList.add(s.replace(" ", " "));
        }
        return outList;
    }
    public static ArrayList<String> filterWords(List<String> stringList) {
        HashSet<String> outSet = new HashSet<>(stringList);
        return new ArrayList<>(outSet);
    }

    public static Map<String, Long> wordsCount(List<String> inList) {
        Map<String, Long> outMap = inList.stream().collect(Collectors.groupingBy
                                                      (Function.identity(), Collectors.counting()));
        System.out.println(outMap);
        return outMap;
    }
/*public void printMap(Map<String, Long>inMap){
        for (Map p:inMap) System.out.println(p);

}*/

}
