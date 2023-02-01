public class Main {
    public static void main(String[] args) {
       MyLinkedList<String> stringMyLinkedList= new MyLinkedList<>();
       stringMyLinkedList.add("cc");
        stringMyLinkedList.add("cc1");
        stringMyLinkedList.add("cc2");

        System.out.println(stringMyLinkedList);
        stringMyLinkedList.remove(1);
        System.out.println(stringMyLinkedList);
        stringMyLinkedList.addFirst("cc21");
        System.out.println(stringMyLinkedList);
        stringMyLinkedList.remove("cc2");
        System.out.println(stringMyLinkedList);

    }
}