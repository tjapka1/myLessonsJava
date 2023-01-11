/*
2
Пусть дан список List объектов типа User{String fName, String lName, int age }.
Предположим, при чтение User-ов из базы данных случилась ошибка и у
всех пользователей из списка поменялись местами fName и lName.
Необходимо написать метод, который исправит данную ситуацию.
Написать тесты
 */

public class User {
    private static int count=0;

    private int id=0;
    private String fName, lName;
    private int age;

    public User(String fName, String lName, int age) {
        this.id = ++count;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id +
                " | " + fName +
                " " + lName +
                " " + age ;
    }

    }

