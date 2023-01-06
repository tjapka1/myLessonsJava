/*
Alexander geier         dj Tjapka
 */
public class Rectangle extends Forms {

    private double a;
    private double b;
    public Rectangle(double a, double b) {
       this.a=a;
       this.b=b;
        setRes((a+b)*2);

    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();

    }
}
