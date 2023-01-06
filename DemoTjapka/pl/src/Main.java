public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        System.out.println("A is " +a);
        System.out.println("B is " +b);
        int aa = plus(a);
        int bb = plus(b);
        double mia =min(a);
        double mib = min(b);
        int ma =mal(a);
        int mb =mal(b);
        double dea =del(a);
        double deb =del(b);
        System.out.println("a pl " + aa);
        System.out.println("b pl is " + bb);
        System.out.println("a min is " + mia);
        System.out.println("b min is " +mib);
        System.out.println("a mal is " +ma);
        System.out.println("b mal is "+ mb);
        System.out.println("a del is " + dea);
        System.out.println("b del is " + deb);

        int c = 600;
        System.out.println("c is " + c);
        double cd =del(c);
        System.out.println("c del is " +cd);

    }

static int plus(int pl){
            pl = pl + 20;
            return pl;
    }
static double min(double mi){
        mi = mi -4.5;
        return mi;
}
static int mal(int ma){
        ma = ma * 2;
        return ma;
}

static double del(double del){
        del=del / 50;
        return del;

}
}