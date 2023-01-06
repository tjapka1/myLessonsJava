public abstract class A3a3A0ElektroProducts extends A2Products {
    private String brend;
    private String model;
    private String cpu;
    private int ram;
    private int rom;
    public A3a3A0ElektroProducts(int artikel, String brend, String productName, double price, double piece, int date, String model, String cpu, int ram, int rom){
        super(artikel, productName, price, piece, date);
        this.brend=brend;
        this.model=model;
        this.cpu=cpu;
        this.ram=ram;
        this.rom=rom;


    }

    public A3a3A0ElektroProducts(int artikel, String productName, double price, double piece, int date, String brend, String model) {
        super(artikel, productName, price, piece, date);
        this.brend = brend;
        this.model = model;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public A3a3A0ElektroProducts(int artikel, String brend, String productName, double price, double piece, int date, String model){
        super(artikel, productName, price, piece, date);
        this.brend=brend;
        this.model=model;


    }
}