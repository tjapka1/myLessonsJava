import java.util.Objects;

public class Person {
   private String firstName;
   private String lastName;
   private int age;

   public Person(String name, int age ) {
      int ind=name.strip().indexOf(" ");
      this.firstName = name.substring(0,ind);
      this.lastName = name.substring(ind+1);
      this.age=age;
   }

     public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public int getAge(){return age;}

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return firstName.equals(person.firstName) && lastName.equals(person.lastName);
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstName, lastName);
   }

   @Override
   public String toString() {
      return "First - "+firstName +" "+"Last - "+ lastName +" * Age - "+age +" ||  ";
   }
}

