public class Client {

    /*
    Давайте представим, что мы реализовываем банковское приложение. Вам необходимо создать
класс Client, со следующими полями: String firstName, String lastName.
Реализуйте конструктор, toString, геттеры. Создайте класс Account со следующими атрибутами String IBAN,
Person client, double balance. Напишите методы конструктора, toString и геттеры.
Создайте массив из объектов Account, распечатайте все счета.
     */
    private String firstName;
    private String lastName;
    Accounts cardData;


    public Client(String name, Accounts cardData) {
        int index =name.indexOf(" ");
        this.firstName = name.substring(0, index);
        this.lastName = name.substring(index+1);
        this.cardData =cardData;
    }


    public String getFirstNam() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Accounts getCardData() {return cardData;}


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCardData(Accounts cardData) {this.cardData = cardData;}


    public String toString() {
        return
                "Firstname: " + firstName +
                 " - Lastname: " + lastName
         +
                "            IBAN " + cardData;
    }
}
