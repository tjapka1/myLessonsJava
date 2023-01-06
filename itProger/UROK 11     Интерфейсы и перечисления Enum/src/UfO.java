public class UfO implements  HumanInterface{

    private int age;
    private Personality person;

    UfO(int age, Personality person){
        this.age=age;
        this.person=person;
    }

    public Personality getPerson() {
        return person;
    }

    @Override
    public void talk() {
        System.out.println("Ya inoplanetnoe suschestvo!");
        System.out.println("Персона "  +person);
    }

    @Override
    public void walk() {
        System.out.println("Ya inoplanetnoe suschestvo i ya umeu hodit!");
    }

    @Override
    public int getAge() {
        return age;
    }
}


