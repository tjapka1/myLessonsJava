public class Main {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println("Size = " + linkedList.size);
        linkedList.print();
        System.out.println("__________");
        linkedList.add("5");
        linkedList.print();
        System.out.println("_______Remove ");
        linkedList.equals(0);
        linkedList.print();


    }
}