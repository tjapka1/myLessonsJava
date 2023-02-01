public class MyLinkedList<T> {
    private Node first =null;
    private Node last=null;
    private int size=0;
    public boolean add(T value){
        Node newNode = new Node(null, null, null);
        if(first ==null){
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size++;

        return true;
    }
    public boolean addFirst(T value){
        Node newNode = new Node(null, null, value);
        if(first ==null){
            last = newNode;
        }else {
            first.setPrev(newNode);
            newNode.setNext(first);

        }
        first=newNode;
        size++;
        return true;
    }

    private Node find(int index){
        if (index <0 || index>=size) throw new IllegalArgumentException();
        int count = 0;
        Node res =first;
        while (count<index){
            res=res.getNext();
            count++;
        }
        return res;
    }
    private Node find(T value) {
        Node res=first;
        while (res!=null){
            Object temp = res.getValue();
            if (value==null && temp== null )return res;
            if (value.equals(temp))return res;
            res=res.getNext();
        }
        return null;
    }
    public boolean remove(T value){
        Node node =find(value);
        if (node!=null){
            remove(node);
            return true;
        }
        return false;
    }
    public T remove(int index){
        Node node =find(index);
        if (node!=null){
            remove((T) node.getValue());
    }
        else {
            return null;
        }
        return null;
    }

      private T remove(Node node){
          if (node==null && first==null)return null;
          if (node == first || node==last) {
              if (node == first) {
                  first = first.getNext();
                  first.setPrev(null);
                  node.setNext(null);
              }
              if (node == last) {
                  last = last.getPrev();
                  last.setNext(null);
                  node.setPrev(null);
              }
          }else {
              node.getPrev().setNext(node.getNext());
              node.getNext().setPrev(node.getPrev());
              node.setPrev(null);
              node.setNext(node);
              node.setValue(null);
          }
        size--;
        return (T) node.getValue();
    }
 /*   public T get (int index){
        if (index<0 || index>=size)return null;
        return toArray()[index];
    }
    private  T [] toArray() {
        T [] outputArray= new T [size];
        int index=0;
        Node temp= first;
        while (temp!=null){
            outputArray[index++]= (T) temp.getObjekt();
            temp=temp.getNext();
        }
        return outputArray;
    }*/
    public int size(){
        return size;
    }
   public String  toString(){
        String outputString="";
        Node temp= first;
        while (temp!=null){
            outputString+=temp.getValue()+" " ;
            temp = temp.getNext();
        }
        return outputString;
    }


}