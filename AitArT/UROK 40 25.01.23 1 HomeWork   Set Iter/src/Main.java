import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TransAction> list = new ArrayList<>();
        list.add(new TransAction(3, new Account("DE_11"), new Account("DE_04"), 400));
        list.add(new TransAction(1, new Account("DE_01"), new Account("DE_02"), 150));
        list.add(new TransAction(2, new Account("DE_05"), new Account("DE_08"), 225));
        list.add(new TransAction(3, new Account("DE_11"), new Account("DE_04"), 400));
        list.add(new TransAction(1, new Account("DE_01"), new Account("DE_02"), 150));
        list.add(new TransAction(4, new Account("DE_06"), new Account("DE_03"), 640));
        list.add(new TransAction(3, new Account("DE_11"), new Account("DE_04"), 400));

        print(list);
        System.out.println("_______________76");
        List<TransAction>delDu=deleteDubl(list);
        print(delDu);
    }
    public static List<TransAction>deleteDubl(List<TransAction>inList){
        List<TransAction>ouList=new ArrayList<>();
        HashSet<TransAction>hashSet=new HashSet<>();
        for (TransAction t:inList){
            if (!hashSet.add(t)){
                ouList.add(new TransAction(1,t.getCredit(),t.getDebit(),t.getAmount()));
            }
        }

        return ouList;
    }
    public static void print(List<TransAction>inputList){
        Iterator<TransAction> p=inputList.listIterator();
        while (p.hasNext()){
            System.out.println(p.next()+" | ");
        }
    }
}