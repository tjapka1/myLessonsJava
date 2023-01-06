public class A3a3a2TV extends A3a3A0ElektroProducts {

    private String fueters;
    private int size;


    public A3a3a2TV(int artikel, String brend, String productName,  String model,  String fueters, int size, double price, double piece, int date) {
        super(artikel, brend, productName, price, piece, date, model);
        this.fueters=fueters;
        this.size=size;


    }






    public String toString() {
        return "TV   " +" | "+super.toString()+ " | " +
                 getBrend() +" - "+
               getProductName() +
                "  Size " + size+
                " Price " + getPrice() + " Eur " +
                " piece " + getPiece() +
                " date " + getDate() ;

}

}
