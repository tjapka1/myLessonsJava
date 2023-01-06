import java.text.DecimalFormat;

public class ArrayAcccaunts {

    private Client [] clients;
    private int size;

    public ArrayAcccaunts(Client[] clients) {
        this.clients = clients;
        for (size= 0; size < clients.length && clients[size]!=null; size++);
    }

    public static void printArray (Client []clients, boolean secCheck ){
        Accounts.setSecureAll1(secCheck);
        for (int i = 0; i < clients.length; i++) {
            System.out.println(clients[i]);
        }
        System.out.println("************");
    }

    public static void balanceBonus (Client[]arr, double bonus){
            for (int i = 0; i < arr.length; i++) {
            arr[i].cardData.setBalance(arr[i].cardData.getBalance() + (arr[i].cardData.balance * bonus / 100));

        }

    }

    /*1
    В классе AccountsArray реализовать метод printClientsWhithBalanceLessThan,
    который выводит на экран всех клиентов банка, с балансом менее заданной суммы.

            2
    В классе AccountsArray реализовать метод посчитает сумму остатков на счетах
    всех клиентов банка.*/


    public static void printClientsWhithBalanceLessThan(Client []clients, double balanceLimit){
        DecimalFormat df = new DecimalFormat(".00");
        int count=0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].cardData.getBalance()<balanceLimit){
                                               count++;
            }

        }
        Client [] res= new Client[count];
        count=0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].cardData.getBalance()<balanceLimit){
                    res[count]=clients[i];
                double result=balanceLimit-res[i].cardData.getBalance();
               // System.out.println(res[i]+result);
                count++;
            }

        }

printArray(res, Pass.checkPass());
    }


}
