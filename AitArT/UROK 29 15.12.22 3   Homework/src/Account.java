import java.util.Objects;

public class Account {

    /*
1) Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName.
Вам дан массив из Account.
Вам необходимо реализовать метод findAccountsByPerson, который принимает объект
Person и выводит на экран все Account принадлежащие данному пользователю.

2) Доработать этот метод таким образом, что бы он возвращал массив String c номерами IBAN для заданного пользователя

1
Используя код написанный в классе, добавить в проекте про Accaunt (ДЗ 2022-12-1
6) сортировку массива Account по значению поля balance

2
Используя код написанный в классе, добавить в проекте про Accaunt (ДЗ 2022-12-16) сортировку массива Account по возрасту клиента




haylou rs4 plus
 */

    private String IBAN;
    private double balance;
    private Person  client;

    public Account(String IBAN, double balance, Person client) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.client=client;
       }


    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return  client + "IBAN " + IBAN + " | balance  | " + balance;
    }
}
