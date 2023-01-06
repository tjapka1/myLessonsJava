/*
Alexander geier         dj Tjapka
 */
public abstract class Forms {
    
    private double res;

    public double getRes() {
        return res;
    }
    public void setRes(double res) {
        this.res = res;
    }
    @Override
    public String toString() {
        return String.valueOf(res);
        //c>0?"a: "+a + " | b:  " + b  + " | c:  " + c  + " = " + res:b>0?"a: "+a + " | b:  " + b  + " = " + res:"a: "+a + " = " + res;

    }
}
