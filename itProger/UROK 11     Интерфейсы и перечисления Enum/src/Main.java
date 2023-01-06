public class Main {
    public static void main(String[] args) {
        Person bob= new Person(23, Personality.MALE);
        System.out.println(bob.getAge());
        bob.talk();

        UfO alien= new UfO(893, Personality.ALIEN);
        System.out.println(alien.getAge());
        alien.talk();

        if (alien.getPerson()==Personality.ALIEN){
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}