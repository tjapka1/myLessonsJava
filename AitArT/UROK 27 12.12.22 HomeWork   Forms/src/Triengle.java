/*
Alexander geier         dj Tjapka
 */
public class Triengle extends Forms {
    private double a;
    private double b;
    private double c;
    private int switcher=0;

       public Triengle(double a, double b,  int methode) {
        this.a=a;
        this.b=b;
            this.switcher=methode;
            if (methode<=0 && methode>=3){setRes(0);}
           if (methode==1){setRes(methode1(a, b));}
    }
    public Triengle(double a, double b, double c, int methode) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.switcher=methode;
        if (methode<=0 && methode>=3){setRes(0);}
        if (methode==1){setRes(methode1(a, b));}
        if (methode==2){setRes(methode2(a, b, c));}
    }
    private double methode1(double a, double b){
           double res=0;
           res = a*b/2;
           return res;
               }
    private double methode2(double a, double b, double c){
        double res=0;
        res = a+b+c/2;
        return res;
    }
    @Override
    public String toString() {
        String [] methosString={"Methode 1", "Methode 2"};
        String x="";
        String res="";
        if (switcher==1){x=methosString[0];}
        if (switcher==2){x=methosString[1];}
        String truem="Triengle " + x+" | " + super.toString();
        if (switcher>0 && switcher<=2 ){res=truem;}
        else {res="No Methode";}
        return res;
    }
}
