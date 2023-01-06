public class NumberProcessing {
    int capacity= 10;
    int [] numArray=new int[capacity];
    int size=0;
    public void add(int num){
        if (size>=numArray.length){
            enLarge();
        }
        numArray[size++]=num;
    }
public void enLarge(){
        int[] numArray2=new int [numArray.length*2];
    for (int i = 0; i < numArray.length; i++) {
        numArray2[i]=numArray[i];
    }
    numArray=numArray2;
}

    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += numArray[i]+ "           ";

        }
        return res;
    }
    public long sum(){
        long res=0;
        for (int i = 0; i < size; i++) {
            res+=numArray[i];
        }
        return res;
    }

    public double avg() {
        if (size != 0) {
            return sum() / (double) size;
        } else {
            return 0;
        }
    }

    public boolean find(int num){
        boolean res= false;
        for (int i = 0; i < size; i++) {
            if (numArray[i]==num){
                return true;
            }

        }
        return false;
    }
}


