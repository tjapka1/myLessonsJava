package deAit.model;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;


    public Person(int id, String firstName, String lastName, int age, boolean sex){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
    }
    public Person(int id, String firstName){
        this.id=id;
        this.firstName=firstName;
    }
    public void setFirstName(String firstName){this.firstName=firstName;}
    public void setLastName(String lastName){this.lastName=lastName;}
    public void setId(int id){this.id=id;}
    public void setAge(int age){this.age=age;}
    public void setSex(boolean sex){this.sex=sex;}

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public String getSex(){
        if(sex){
        //System.out.println("Male");
        return "Male";
    }
    else{
        return "Feamale";
    }
    }
    public void displeyPerson(){
        System.out.println("id: "+id);
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Age is: "+age);
        System.out.println("Sex is: "+getSex());
        System.out.println("___________");
    }
}
