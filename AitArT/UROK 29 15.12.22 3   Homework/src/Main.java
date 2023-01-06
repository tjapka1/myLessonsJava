import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*
1) Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName.
Вам дан массив из Account.
Вам необходимо реализовать метод findAccountsByPerson, который принимает объект
Person и выводит на экран все Account принадлежащие данному пользователю.

2) Доработать этот метод таким образом, что бы он возвращал массив String c номерами IBAN для заданного пользователя
 */

        Person p1=new Person("James Bond", 52);
        Account[] accounts = {
                new Account("DE54522054051", 455, new Person("Alex Geier", 33)),
                new Account("DE54522054055", 355, p1),
                new Account("DE54522054052", 555, new Person("Mike Meier", 20)),
                new Account("DE54522054056", 365, p1),
                new Account("DE54522054053", 155, new Person("Ingo Man", 13)),
                new Account("DE54522054057", 375, p1),
                new Account("DE54522054054", 255, new Person("Dirk Lin", 23)),
        };

        System.out.println("------Orig");
        Tools.print(accounts);

        System.out.println("------Age Max");
        Tools.sortAll(accounts, 1);
        Tools.print(accounts);

        System.out.println("------Age Min");
         Tools.sortAll(accounts, 2);
        Tools.print(accounts);

        System.out.println("------Balance Max");
        Tools.sortAll(accounts, 3);
        Tools.print(accounts);

        System.out.println("------Balance Min");
        Tools.sortAll(accounts, 4);
        Tools.print(accounts);

        System.out.println("------ Search Iban");

        String searchName="man";

        System.out.println("search Name   "+searchName);
        //Tools.findAccountsByPerson(accounts, searchName);

        System.out.println("------Print Search Iban");
        Tools.printAccountsByPerson(accounts, p1);

        System.out.println("------Find Search Iban");
        Tools.findAccountsByPerson(accounts, p1);


        System.out.println("------------- AccountsArray ---------------------------");
        AccountArray accountsArray = new AccountArray();
        accountsArray.add(new Account("DE9999000010", 1040, new Person("John Jonson5", 23)));
        accountsArray.add(new Account("DE9999000011", 1040, new Person("John Jonson5", 23)));
        accountsArray.add(accounts);
        //accountsArray.print1();
        Tools.print(accountsArray.getAsArray());
        System.out.println("---- find by person " + p1 + " :");
        Tools.print(accountsArray.findAccountsByPerson(p1));

        System.out.println("-------------------------------------------------------------------------");



    }
}