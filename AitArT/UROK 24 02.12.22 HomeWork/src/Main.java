public class Main {
    public static void main(String[] args) {
        /*

Давайте представим, что мы реализовываем банковское приложение. Вам необходимо создать
класс Client, со следующими полями: String firstName, String lastName.
Реализуйте конструктор, toString, геттеры. Создайте класс Account со следующими атрибутами String IBAN,
Person client, double balance. Напишите методы конструктора, toString и геттеры.
Создайте массив из объектов Account, распечатайте все счета.

2
В классе Account напишите метод secureToString, который работает как обычный toString,
но вместо IBAN помещает в результирующую строку что-то вроде DE45*35
(заменяет все символы строки IBAN на char '*', кроме четырех первых и двух последних персонажи).

3
Напишите метод, который получает массив Account и увеличивает баланс каждого счета на 10%
         */

        Client[] clients = {
                new Client("Alex Geier", new Accounts("DE27100777770209299700", 10.00, true)),
                new Client("Natalie Geier", new Accounts("de320154220000000000", 30.0, true)),
                new Client("Max Master", new Accounts("de320003565", 100, true))
        };



        ArrayAcccaunts.balanceBonus(clients, 1);
        ArrayAcccaunts.printArray(clients, Pass.checkPass());
        ArrayAcccaunts.printClientsWhithBalanceLessThan(clients, 32);

    }
}




