import java.util.Comparator;

public class Person implements Comparable <Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name +  age;
    }



    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
    }
class ComparatorPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
