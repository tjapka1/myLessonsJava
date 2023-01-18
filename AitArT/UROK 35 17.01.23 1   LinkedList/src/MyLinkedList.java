public class MyLinkedList {

    private Node first = null;
    private Node last = null;
    int size = 0;



    public boolean add(String value){
        Node newNote = new Node(null, null , value);
        if (first==null){
            first=newNote;
                  }
        else {
            last.setNext(newNote);
            newNote.setPrev(last);
                   }
        last=newNote;
        size++;
         return true;
    }
    public boolean remove(int index){
        if (index<0 || index>size){return false;}
        if (index == size){last=last.getNext();}

        /*Node newNode=new Node();
        while (newNode!=null){
            if (newNode.getNext().getValue()==index){
                newNode.getNext()=newNode.getNext().getNext();
                return true;
            }
        }/*/

        return true;
    }

    public void print(){
            Node temp= first;
            while (temp!=null ){
                System.out.println(temp.getValue());
                temp=temp.getNext();
        }
    }
    public int size(){
        return size;
    }

    public String  toString(){
        String outputString="";
        Node temp= first;
        while (temp!=null){
            outputString+=temp.getValue()+"\n";
            temp = temp.getNext();
        }
        return outputString;
    }
    public String[] toArray(){
        String [] outputArr = new String[size];
        int index=0;
        Node temp=first;
        while (temp!=null){
            outputArr[index++]=temp.getValue();
            temp=temp.getNext();
        }
    return outputArr;
    }
    public String get(int index){
        if (index<0 ||  index>=size) return null;
        return toArray()[index];
    }

}
