public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private String firstNameFormat(String firstName){
        String res="";
        res=firstName.substring(0, 1) + ".";
        return res;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return firstNameFormat(firstName) +" "+ lastName+" " +age ;
    }
}
