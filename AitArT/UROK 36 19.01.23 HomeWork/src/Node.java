public class Node {
    private Node prev =null;
    private Node next =  null;
    private Worker objekt=null;

    public Node(Node prev, Node node, Worker objekt) {
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

    public Worker getObjekt() {
        return objekt;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setObjekt(Worker objekt) {
        this.objekt = objekt;
    }
}
