/*
Alexander geier         dj Tjapka
 */
public class Square extends Forms {


    private double a;

    public Square(double a) {
        this.a=a;
            setRes(a*4);
    }
    @Override
    public String toString() {return "Square " + super.toString();
    }
}
