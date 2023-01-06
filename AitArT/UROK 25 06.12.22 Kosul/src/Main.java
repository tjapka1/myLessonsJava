public class Main {
    public static void main(String[] args) {

        Toy[] toys={new Toy("ball", "red", "sphere"),
                            new Toy("log", "brown", "cylindrical")};
Panda smockey=new Panda("as", 23, true, toys,false);
        System.out.println(smockey);
    }
}