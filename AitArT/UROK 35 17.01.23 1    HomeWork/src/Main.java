import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList personList =new MyLinkedList();
        personList.add(new Person("Ilja", 5));
        personList.add(new Person("Maga", 6));
        personList.add(new Person("Walja", 5));
        personList.add(new Person("Wasja", 6));

        System.out.println(personList);
        print(personList);
        System.out.println(personList.size());
        System.out.println("______________");
       personList.remove(4);
        print(personList);
        System.out.println(personList.size());


    }
    public static void print(MyLinkedList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
    public static void print(LinkedList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

}