public class Main {
    public static void main(){
    sman(2);

}
    static void sman(int arm){   //Switch - case

        switch(arm){
            case 1:
                System.out.println("Help");
                System.out.println("Hospital");
                break; // stop function
            case 2:
                System.out.println("Ok");
                System.out.println("Work");
                break;
            case 3:
                System.out.println("Super");
                System.out.println("circus");
                break;
            case 4:
                System.out.println("4 Atms");
                System.out.println("indian");
                break;
            default:
                System.out.println("Error 486 There is no such ticket");
                System.out.println("I'm calling to police");

        }

    }
}