import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<BankAccountWithOwner> list=List.of(
                new BankAccountWithOwner(new Person("Adam"), "DE01"),
                new BankAccountWithOwner(new Person("Wasja"), "DE02"),
                new BankAccountWithOwner(new Person("Katja"), "DE03"),
                new BankAccountWithOwner(new Person("Adam"), "DE04"),
                new BankAccountWithOwner(new Person("Wasja"), "DE05"),
                new BankAccountWithOwner(new Person("Katja"), "DE06"),
                new BankAccountWithOwner(new Person("Vika"), "DE07"),
                new BankAccountWithOwner(new Person("Katja"), "DE08")
        );
        System.out.println(listOfAccounts(list));

    }

    public static Map<Person, HashSet<String>> listOfAccounts(List<BankAccountWithOwner> inList){
        Map<Person, HashSet<String>> ouMap=new HashMap<>();
        for (BankAccountWithOwner owner:inList){
            HashSet<String> ibans=new HashSet<>();
            if (owner==null || owner.getiBan()==null || owner.getOwner()==null){
                System.out.println("Не правильный Клент");
                continue;
            }
            if (!ouMap.containsKey(owner.getOwner())){
                ouMap.put(owner.getOwner(), ibans);
                ibans.add(owner.getiBan());
            }else {
                HashSet<String> strings=ouMap.get(owner.getOwner());
                strings.add(owner.getiBan());
            }
        }

        return ouMap;
    }


}