public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Some text");
        System.out.println(34);
        int a=10; //INTEGER
        System.out.println(a);
        System.out.println("Variable a is " + a + " Some new Text here " + a*10);

        intro();
        System.out.println("Vasili");
        intro();
        System.out.println("Petr");
        intro();
        System.out.println("Elena");

        double b=3.14; // Double +- = floats digits with .
        System.out.println("Here is double " + b);

        boolean d= true;
        boolean c= false;
        System.out.println("Here is boolean D "+ d);
        System.out.println("Here is boolean C "+ c);
        boolean e = a >= b;
        System.out.println(e);
        double vasya1 = 30;
        double petya1 = 12;
        petya1=changeCoffee(petya1);
        petya1=changeCoffee(petya1);
        petya1=changeCoffee(petya1);
        System.out.println("Petya has in main function " + petya1);
        vasya1=changeCoffee(vasya1);
        System.out.println("Vasya has in main function " + vasya1);

        fan(0);
        fan(2);
        fan(9);
        fan(6);

        int c1=ticket(1);
        System.out.println(c1);
        a=100;
        int res=a-c1;
        System.out.println(res);
        intro();

    }
    public static int ticket(int choise){
        switch (choise){
            case 1:
                System.out.println("Your choise is 1");
                int x=10;
                return x;
            case 2:
                System.out.println("Your choise is 2");
                int y=20;
                return y;
            default:
                System.out.println("Error no such choise");
                return -1;
        }
    }
    public static void fan(int mode){
        switch (mode){
            case 0:
                System.out.println("Fan is Off");
                break;
            case 1:
                System.out.println("Fan is on slow mode");
                break;
            case 2:
                System.out.println("Fan is on hurricane mode");
                break;
            default:
                System.out.println("!!!ERROR WRONG MODE!!!");
                break;

        }
    }

    public static double changeCoffee(double amount){
        double priceCoffee = 3.10; // Coffee price
        double change = amount - priceCoffee;
        System.out.println("Here is your coffee");
        System.out.println(" Your change is " + change);
        return change;
    }

    public static void intro(){
        System.out.println("Hello my name is ");
    }
}