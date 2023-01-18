public class MyLinkedList {
    private Node first=null;
    private Node last=null;
    private int size=0;


    public boolean add(Person person){
        Node newNode = new Node(null, null, person);
        if(first==null){
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size++;

        return true;
    }
    public boolean remove(int index){
        if (last==null){return false;}
        //if (last.getObj()== index){
        last = last.getNext();


        return true;
    }

    public Person get (int index){
        if (index<0 || index>=size)return null;
        return toArray()[index];
    }

    private Person[] toArray() {
        Person [] outputArray= new Person[size];
        int index=0;
        Node temp=first;
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