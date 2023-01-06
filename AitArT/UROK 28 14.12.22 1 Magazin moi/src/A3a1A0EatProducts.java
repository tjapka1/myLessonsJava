public class A3a1A0EatProducts extends A2Products {



    public A3a1A0EatProducts(int artikel, String productName, double price, double piece, int date) {
        super(artikel, productName, price, piece, date);

    }



    @Override
    public String toString() {
        return "EatProducts " +" | "+super.toString()+ " | " +
                " productName " + getProductName() +
                " price " + getPrice() + " Eur " +
                " piece " + getPiece() +
                " date " + getDate() ;
    }
}
