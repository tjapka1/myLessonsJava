public class Node {
    private Node prev=null;
    private Node next=null;
    private Person objekt = null;

    public Node(Node prev, Node next, Person person) {
        this.prev = prev;
        this.next = next;
        this.objekt = person;
    }

    public Node prev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getObjekt() {
        return objekt;
    }

    public void setObjekt(Person objekt) {
        this.objekt = objekt;
    }
}
