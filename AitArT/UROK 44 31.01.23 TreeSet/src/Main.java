import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(-1);
        set.add(2);

       Iterator<Integer> iterator=set.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

        Person p1=new Person("Jack", 32);
        Person p2=new Person("Ivan", 35);
        Person p3=new Person("Kolja", 33);
        Person p4=new Person("Jack", 30);
        Person p5=new Person("Ivan", 32);

        Set<Person>personSet=new TreeSet<>(new ComparatorPerson());
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        Iterator<Person> personIterator=personSet.iterator();

        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

        BinaryTree tree = new BinaryTree();

        tree.add(1);
        tree.add(2);
        tree.add(19);
        tree.add(5);
        tree.add(-1);

        System.out.println("find: "+tree.find(1));

        //tree.insert(6);
        //tree.insert(4);
        //tree.insert(-8);
        tree.print();
    }
}