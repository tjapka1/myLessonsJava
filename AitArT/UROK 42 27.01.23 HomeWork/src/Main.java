import java.util.*;
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
                "*В контексте данной задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи задачи все слова разделены\n" +
                "1 пробелом и текст не содержит знаков знаков  знаков знаков  знаков знаков  знаков знаков препинания.\n" +
                " Для тех, кому чуть сложнее, можете решить используя реальный текст,\n" +
                " содержащий знаки знаки знаки знаки препинания.";


        toCount(text, 2);

        List<String> words = new ArrayList<>();
        words.add("da");
        words.add("ja");
        words.add("da");
        words.add("ne");
        words.add("ja");
        words.add("ja");
     //  words.add(null);

        toCount(words, 2);
    }

    public static void toCount(List<String> inList, long abNum) {
        System.out.println("_________List_______");
        Map<String, Long> listToMap = wordsCount(inList);
        List<WordsCount> addWords = addWords(listToMap);
        List<WordsCount> wordsOf3 = null;
        try {
            wordsOf3 = getNumOfWords(addWords, abNum);
        } catch (NoCountWordsException e) {
            System.out.println("No Word");
            //throw new RuntimeException(e);
        }
        print(wordsOf3);
    }
    public static void toCount(String inStr, long abNum) {
        System.out.println("_______String______");
        List<String> strToList = textStringToList(inStr);
        Map<String, Long> listToMap = wordsCount(strToList);
        List<WordsCount> addWords = addWords(listToMap);
        List<WordsCount> wordsOf = null;
        try {
            wordsOf = getNumOfWords(addWords, abNum);
        } catch (NoCountWordsException e) {
           System.out.println("No Word");
        }
        print(wordsOf);
    }
    public static List<String> textStringToList(String inStr) {
        List<String> outList = new ArrayList<>();
        for (String s : inStr.split(" ")) {
            outList.add(s.replace(" ", " "));
        }
        return outList;
    }
    public static List<String> filterWords(List<String> stringList) throws NoCountWordsException {
        HashSet<String> outSet = new HashSet<>();
        for (String word:stringList)
            if (word==null){throw new NoCountWordsException("No Word");}
            else {outSet.add(word);}
        List<String>outList=new ArrayList<>(outSet);
        return outList;
    }
    public static Map<String, Long> wordsCount(List<String> inList) {
        Map<String, Long> outMap = inList.stream().collect(Collectors.groupingBy
                (Function.identity(), Collectors.counting()));
        return outMap;
    }
    public static List<WordsCount> addWords(Map<String, Long> inMap) {
        List<WordsCount> outList = new ArrayList<>();
        Set<Map.Entry<String, Long>> entries = inMap.entrySet();
        for (Map.Entry<String, Long> p : entries) {
            if (p.getValue() != null) {
                outList.add(new WordsCount(p.getKey(), p.getValue()));
            }
        }

        return outList;
    }
    public static List<WordsCount> getNumOfWords(List<WordsCount> inList, long abNum) throws NullPointerException, NoCountWordsException {
        List<WordsCount> outList = new ArrayList<>();
        for (WordsCount words : inList) {
            if (words.getCount()==0){throw new NoCountWordsException("Null");}
            else if (words.getCount() >= abNum) {
                outList.add(new WordsCount(words.getWords(), words.getCount()));
            }
        }
        return outList;
    }
    public static void print(List<WordsCount> inList) {
        for (WordsCount words : inList) {
            System.out.println(words);
        }
    }
    public static void print(Map<String, Long> inMap) {
        Set<Map.Entry<String, Long>> entries = inMap.entrySet();
        for (Map.Entry<String, Long> p : entries)
            System.out.println(p.getKey() + " " + p.getValue());
    }
}

class WordsCount implements Comparable {
    private String words;
    private long count;

    public WordsCount(String words, long count) {
        this.words = words;
        this.count = count;
    }

    public String getWords() {
        return words;
    }

    public long getCount() {
        return count;
    }

    @Override
    public int compareTo(Object word) {
        return (int) (this.count - count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsCount that = (WordsCount) o;
        return count == that.count && Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, count);
    }

    @Override
    public String toString() {
        return words + " " + "=" + count;
    }
}
