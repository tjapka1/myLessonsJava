public class A3a3A3Laptop extends A3a3A0ElektroProducts {


    public A3a3A3Laptop(int artikel, String brend,  String productName, double price, int piece, String cpu, int ram, int rom, int date) {
        super(  artikel, brend, productName, price, piece, date, cpu);

    }



    public String toString() {
        return "Laptops   " +" | "+super.toString()+ " | " +
                getModel() +" - "+
                getProductName() +
                "  CPU " + getCpu() +
                " RAM " + getRam() +
                " ROM " + getRom() +
                " Price " + getPrice() + " Eur " +
                " piece " + getPiece() +
                " date " + getDate();
    }
}