public class Toy {
    private String tittle;
    private String color;
    private String form;

    public Toy(String tittle, String color, String form) {
        this.tittle = tittle;
        this.color = color;
        this.form = form;
    }
    public String toString(){
        return color+ " " +form+ " " + tittle;}
}
