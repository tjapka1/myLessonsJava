public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int a=10;
        System.out.println("Integer " + a);
        float b=1.335f;
        System.out.println("Float " + b);
        double pi = 3.1415926;
        System.out.println("Double " + pi);

        boolean k = false;
        boolean f = true;
        System.out.println(k);
        System.out.println(f);

        boolean x = a>=2;
        System.out.println(x);
        // BVG - Ticket automat
        // 1 - Tram ticket
        // 2 - U-Bahn ticket
        // 3 - S-Bahn
        // 4 - Bus ticket

        ticketChoise(2);

    }
    static void ticketChoise(int button){
        switch (button){
            case 1:
                System.out.println("print train ");
                System.out.println("kauf " );
                break;
            case 2:
                System.out.println("print ubahn");
                System.out.println("kauf Ubahn");
                break;
            case 3:
                System.out.println("print sbahn");
                System.out.println("kauf Sbahn");
                break;
            default:
        }
    }
}
