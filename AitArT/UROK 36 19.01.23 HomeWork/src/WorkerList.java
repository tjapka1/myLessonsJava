public class WorkerList {

    private Node first = null;
    private Node last = null;
    private int size=0;


    public boolean add(Worker worker){
        Node newNode = new Node(null, null, worker);
        if (first==null){first=newNode;}
        else{
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last=newNode;
        size++;
        return true;
    }
    private Worker[] toArray(){
        Worker[] outputArr=new Worker[size];
        int index= 0;
        Node temp=first;
        while (temp!=null){
            outputArr[index++]=temp.getObjekt();
            temp=temp.getNext();
        }
        return outputArr;
    }
    public Worker get(int index){
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
