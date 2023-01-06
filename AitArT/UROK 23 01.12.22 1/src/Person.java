public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private int id;


/*    public Person(int id, String name, int age){
        String [] nameSplit=name.split(" ");
        this.id=id;
        this.firstName=nameSplit[0];
        this.lastName=nameSplit[1];
        this.age=age;
    }*/

    public Person(int id, String name, int age){
      int index =name.indexOf(" ");
        this.id=id;
        this.firstName=name.substring(0, index);
        this.lastName=name.substring(index+1);
        this.age=age;
    }
    public Person(String name){
        this.firstName=name;
    }
    public Person(String name, int age) {
        this.firstName = name;
        this.age=age;
    }
    public Person(){
        this.firstName="name";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(){
if (checkRights()) {
    return age;
}
else {return -1;}
}
boolean checkRights(){
        return true;
}













          @Override
    public String toString() {
        return String.format("%s * %s * %s ", firstName, lastName, (age==0 ? " ":age>=20 ? ", age = " + age:
                                                                                                        ", yung, Your age is  " +  age +" | "  + "20 - " + age + " = " + (20-age))) ;
}
}
