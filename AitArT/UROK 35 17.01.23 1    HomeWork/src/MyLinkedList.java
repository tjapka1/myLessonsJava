public class MyLinkedList {
    private Node first =null;
    private Node last=null;
    private int size=0;
    public boolean add(Person person){
        Node newNode = new Node(null, null, person);
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
    public boolean addFirst(Person person){
        Node newNode = new Node(null, null, person);
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
    private Node find(Person person) {
        Node res=first;
        while (res!=null){
            Person temp = res.getObjekt();
            if (person==null && temp== null )return res;
            if (person.equals(temp))return res;
            res=res.getNext();
        }
        return null;
    }
    public boolean remove(Person person){
        Node node =find(person);
        if (node!=null){
            remove(node);
            return true;
        }
        return false;
    }
    public Person remove(int index){
        Node node =find(index);
        if (node!=null){
            remove(node.getObjekt());
    }
        else {
            return null;
        }
        return null;
    }

      private Person remove(Node node){
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
              node.setObjekt(null);
          }
        size--;
        return node.getObjekt();
    }
    public Person get (int index){
        if (index<0 || index>=size)return null;
        return toArray()[index];
    }
    private Person[] toArray() {
        Person [] outputArray= new Person[size];
        int index=0;
        Node temp= first;
        while (temp!=null){
            outputArray[index++]=temp.getObjekt();
            temp=temp.getNext();
        }
        return outputArray;
    }
    public int size(){
        return size;
    }
   public String  toString(){
        String outputString="";
        Node temp= first;
        while (temp!=null){
            outputString+=temp.getObjekt()+" " ;
            temp = temp.getNext();
        }
        return outputString;
    }


}