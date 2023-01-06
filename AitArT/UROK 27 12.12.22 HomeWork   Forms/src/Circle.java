import java.text.DecimalFormat;

/*
Alexander geier         dj Tjapka
 */
public class Circle extends Forms {
    private double radius;
    final double p= 3.14;
    private int switcher;

    public Circle(double radius, int switcher) {
        this.radius=radius;
        this.switcher=switcher;
        if (switcher==1){this.setRes(place(radius));}
        if (switcher==2){this.setRes(round(radius));}
      }
    private double place(double radius){
        double res=0;
        res = p*radius*radius;
        return res;
    }
    private double round(double radius){
        double res=0;
        res=2*p*radius;
        return res;
    }
    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat(".00");
        String [] results={"Place", "round"};
        String x="";
        if (switcher==1){x=results[0];}
        if (switcher==2){x=results[1];}
        return "Circle " + x + " with "+" Radius "+radius+ " = " + df.format(getRes());
    }
}
