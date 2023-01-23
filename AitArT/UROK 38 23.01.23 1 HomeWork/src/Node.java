public class Node <T>{
    private Node prev=null;
    private Node next=null;
    private T objekt = null;

    public Node(Node prev, Node next, T objekt) {
        this.prev = prev;
        this.next = next;
        this.objekt = objekt;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getObjekt() {
        return objekt;
    }

    public void setObjekt(T objekt) {
        this.objekt = objekt;
    }
}
