public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // 1 - Tram ticketPrice 3.60
        // 2 - S-Bahn ticketPrice 3.80
        // 3 - U-Bahn ticketPrice 3.00
        int choise =3;
        double bill=20;

        ticketSale(choise, bill);


    }
    public static double ticketSale(int choise, double bill){

        double change=0;
        switch(choise){
            case 1:
                double priceTram=3.60;
                System.out.println("Your choise is tram ticket price is " + priceTram);
                change= bill - priceTram;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 2:
                double priceSbahn=3.80;
                System.out.println("Your choise is Sbahn ticket price  " + priceSbahn);
                change= bill - priceSbahn;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 3:
                double priceUbahn=3.00;
                System.out.println("Your choise is Ubahn ticket price is " + priceUbahn);
                change= bill - priceUbahn;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            default:
                System.out.println("No such ticket");
                //return -1;
                break;
        }
        return change;
    }

}