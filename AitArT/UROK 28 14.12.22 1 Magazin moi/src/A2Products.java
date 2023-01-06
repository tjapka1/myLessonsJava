public  abstract class A2Products {

    private final int artikel;
    private String productName;
    private double price;
    private double piece;
    private int date;

    public A2Products(int artikel, String productName, double price, double piece, int date) {
        this.artikel = artikel;
        this.productName = productName;
        this.price = price;
        this.piece = piece;
        this.date = date;
    }

    public int getArtikel() {
        return artikel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPiece() {
        return piece;
    }

    public void setPiece(double piece) {
        this.piece = piece;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Artikel=" + artikel;
    }



}
