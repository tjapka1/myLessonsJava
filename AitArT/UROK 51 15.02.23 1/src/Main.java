import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
    Дан список банковских транзакций (Account debit, Account credit, amount),
    класс Account(IBAN, Person) - банковский счет. Необходимо
    реализовать метод который сортирует транзакции по сумме
    (по возрастанию, по убыванию), по номеру счета дебита, по номеру счета кредита,
    по имени персона в счете по дебету, по имени персона в счете по кредиту
     */
    public static void main(String[] args) {
        List<Transaction>transactionList=List.of(
                new Transaction(new Accaunt("DE01", new Person("Smidt")), new Accaunt("DE11", new Person("Smidt2")), 321.00 ),
                new Transaction(new Accaunt("DE02", new Person("Puschkin")), new Accaunt("DE12", new Person("Tolstoi")), 322.00 ),
                new Transaction(new Accaunt("DE03", new Person("Tchapaev")), new Accaunt("DE13", new Person("Ivanod")), 333.00 )
        );

        List<Transaction> byAmout=sort(transactionList, (o1, o2) -> (int) (o2.getAmount()-o1.getAmount()));
        print(byAmout);


        System.out.println("Wwaadfksiddlжвыфasфяlz.zdg");
    }
    public static List<Transaction> sort(List<Transaction> inList, Comparator<Transaction>comparator){
        List<Transaction>ouList=new ArrayList<>(inList);
        ouList.sort(comparator);
        return ouList;
    }

    public static void print(List<Transaction>inList){
          inList.forEach((Transaction t)-> System.out.println(t));

        }
    }
