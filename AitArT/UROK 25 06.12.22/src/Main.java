public class Main {
    public static void main(String[] args) {
        People people = new People(5);
        people.add(new Person("Jack",10));
        System.out.println("------------- 1 ---------------");
        System.out.println(people);

        people.add(new Person("John",15));
        System.out.println("------------- 2 ---------------");
        System.out.println(people);

        people.add(new Person("Nick",20));
        System.out.println("------------- 3 ---------------");
        System.out.println(people);


        people.add(new Person("Sten",25));
        System.out.println("------------- 4 ---------------");
        System.out.println(people);

        System.out.println("------------- selectPersonOlderThan ---------------");
        System.out.println(people.selectPersonolderThan(20));

        People tjapla=new People(10);
        tjapla.add(new Person("Vovan", 32));
        tjapla.add(new Person(" Michan", 34));
        System.out.println(tjapla);


    }
}