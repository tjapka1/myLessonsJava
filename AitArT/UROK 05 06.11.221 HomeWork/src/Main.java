/*Homework
06.11.22
Alexander Geier
 */
public class Main {
    public static void main(String[] args) {

        double budget = 500;

        double prod1 = Producs(1);
        double prod2 = Producs(0);
        double prod3 = Producs(0);

        System.out.println("You have " + budget + " Eur");

        double AllPr = prod1 + prod2 + prod3;
        System.out.println("You have to pay for everything " + AllPr + " Eur");
        double Change = budget - AllPr;
        System.out.println("Your change is " + Change + " Eur");

    }

    static int Producs(int prod) {
        switch (prod) {
            case 0:
                int n = 0;
                System.out.println("You  Buy nothing");
                return n;
            case 1:
                System.out.println("You buy chain for your bike");
                double chainp = 10;
                System.out.println("one Cain costs " + chainp + " Eur");
                double chainm = 10;
                System.out.println(" You buy " + chainm +" pieces");
                double chainr = chainp * chainm;
                System.out.println("Preis for all Chains " + chainr);
                return (int) chainr;
            case 2:
                System.out.println("You buy Brake for your bike");
                double brakep = 23;
                System.out.println("one Brake costs " + brakep + " Eur");
                double brakem = 2;
                System.out.println(" You buy " + brakem + " pieces");
                double braker = brakep * brakem;
                System.out.println("Preis for all Chains " + braker);
                return (int) braker;
            case 3:
                System.out.println("You buy Spike for your bike");
                double spikep = 1;
                System.out.println("one Spike costs " + spikep + " Eur");
                double spikem = 36;
                System.out.println(" You buy " + spikem + " pieces");
                double spiker = spikep * spikem;
                System.out.println("Preis for all Chains " + spiker);
                return (int) spiker;
            default:
                double Def = 0;
                System.out.println("error  32147");
                System.out.println("There is no article");
                return (int) Def;
        }
    }
}

