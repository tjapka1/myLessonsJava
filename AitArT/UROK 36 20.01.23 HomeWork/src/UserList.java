public class UserList {

    private Node first = null;
    private Node last = null;
    private int size=0;


    public boolean add(User user){
        Node newNode = new Node(null, null, user);
        if (first==null){first=newNode;}
        else{
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last=newNode;
        size++;
        return true;
    }
    private User[] toArray(){
        User[] outputArr=new User[size];
        int index= 0;
        Node temp=first;
        while (temp!=null){
            outputArr[index++]=temp.getObjekt();
            temp=temp.getNext();
        }
        return outputArr;
    }
    public User get(int index){
        if (index<0||index>=size)return null;
        return toArray()[index];
    }
    public String toString(){
        String outputString ="";
        Node temp= first;
        while (temp!=null){
            outputString+=temp.getObjekt()+" ";
            temp=temp.getNext();
        }
        return outputString;
    }
    public int size ( ){return size;}
    public boolean remove(int index){
        if (index<0 || index>size){
            return false;}
        if (index==0){
            first = first.getNext();
        }
        else if (index==size-1){
            last = last.getPrev();
        }
        int count=0;
        Node delNode=first;
        while (delNode!=null){
            if (count==index){
            }
            count++;
        }
        size--;
        return true;
    }




}
