public class Node {
    private Node prev =null;
    private Node next =  null;
    private User objekt=null;

    public Node(Node prev, Node node, User objekt) {
        this.prev = prev;
        this.next = node;
        this.objekt = objekt;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public User getObjekt() {
        return objekt;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setObjekt(User objekt) {
        this.objekt = objekt;
    }
}
