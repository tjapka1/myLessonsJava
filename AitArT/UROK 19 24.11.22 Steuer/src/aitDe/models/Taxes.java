package aitDe.models;

public class Taxes {

    public static double Taxes(double salary) {

        double [] taxesProzent={9,16,35,43,48,0.0};
        double [] taxesManny={10000, 25000, 50000,80000,120000};
        double taxMan = taxesProzent[5];
        if (salary<=taxesManny[0]){taxMan=taxesProzent[5];}
        if (salary>taxesManny[0] && salary<=taxesManny[1] ){taxMan=taxesProzent[1];}
        if (salary>taxesManny[1] && salary<=taxesManny[2] ){taxMan=taxesProzent[2];}
        if (salary>taxesManny[2] && salary<=taxesManny[3] ){taxMan=taxesProzent[3];}
        if (salary>+taxesManny[4] ){taxMan=taxesProzent[4];}


                return taxMan;
    }
}
