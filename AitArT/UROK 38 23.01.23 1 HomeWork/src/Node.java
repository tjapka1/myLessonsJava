public class Node<T>{
    private Node prev=null;
    private Node next=null;
    private Node value = null;

    public Node(Node prev, Node next, Node value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
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

    public Node getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }
}
