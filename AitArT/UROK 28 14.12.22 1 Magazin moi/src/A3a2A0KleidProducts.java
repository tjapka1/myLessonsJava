public class A3a2A0KleidProducts extends A2Products {

    private String brend;
 private String fueters;
 private String size;
    private boolean miles; //женский /Мужской

    public A3a2A0KleidProducts(int artikel, String productName, double price, double piece, int date, String brend, String fueters, String size, boolean miles) {
        super(artikel, productName, price, piece, date);
        this.brend=brend;
        this.fueters = fueters;
        this.size=size;
        this.miles = miles;
    }






    @Override
    public String toString() {
        return "KleidProducts "+" | "+super.toString()+ " | " +
                " brend" + brend +
                "  productName " + getProductName() +
                " price " + getPrice() + " Eur " +
                " fueters '" + fueters +
                " miles " + miles +
                " size " + "[ "+size+" ]" +
                " piece " + getPiece() +
                " date " + getDate();
    }
}
