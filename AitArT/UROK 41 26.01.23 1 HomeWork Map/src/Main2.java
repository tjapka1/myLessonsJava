import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<Integer, Person> personMap=new HashMap<>();
        personMap.put(1, new Person("Wasja", 62));
        personMap.put(2, new Person("Wasja", 62));
        personMap.put(3, new Person("Kolja", 62));
        personMap.put(4, new Person("Wova", 23));

        System.out.println(personMap.get(2));

    }
}
