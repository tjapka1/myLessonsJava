import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person>personList=new ArrayList<>();
        personList.add(new Person("Wasja", 62));
        personList.add(new Person("Wasja", 62));
        personList.add(new Person("Kolja", 62));
        personList.add(new Person("Wova", 23));
        personList.add(new Person("Wova", 23));


        print(personList);
        System.out.println("________");

        List<Person>filtterPer=noDublList(personList);
        print(filtterPer);
    }
    public static List<Person> noDublList(List<Person>inputList){
        Set<Person> out=new HashSet<>(inputList);
        return new ArrayList<>(out);
    }
    public static void print(List<Person>inputList){
        Iterator<Person>p=inputList.listIterator();
        while (p.hasNext()){
            System.out.print(p.next()+" | ");
        }
        System.out.println();
    }
}