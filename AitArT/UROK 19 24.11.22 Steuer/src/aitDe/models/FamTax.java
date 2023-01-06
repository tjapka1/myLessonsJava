package aitDe.models;

public class FamTax {



    public static double prozClass(boolean sex, int classes, double salary) {

        int[] clastax = {0, 1, 2, 3, 4, 5};
        double[] clasprozMann = {0, 5, 7, 10, 12, 15};
        double[] clasprozWom = {0, 3, 5, 7, 10, 12};
        double cla = 0;
        double res;

        if (sex == true) {
            if (classes == clastax[0]) {
                cla = clasprozMann[0];
            }
            if (classes == clastax[1]) {
                cla = clasprozMann[1];
            }
            if (classes == clastax[2]) {
                cla = clasprozMann[2];
            }
            if (classes == clastax[3]) {
                cla = clasprozMann[3];
            }
            if (classes == clastax[4]) {
                cla = clasprozMann[4];
            }
            if (classes == clastax[5]) {
                cla = clasprozMann[5];
            }
            if (cla > clasprozMann[0]) {
                res = salary / cla;
                return res;
            }
        }

        if (sex == false) {
            if (classes == clastax[0]) {
                cla = clasprozWom[0];
            }
            if (classes == clastax[1]) {
                cla = clasprozWom[1];
            }
            if (classes == clastax[2]) {
                cla = clasprozWom[2];
            }
            if (classes == clastax[3]) {
                cla = clasprozWom[3];
            }
            if (classes == clastax[4]) {
                cla = clasprozWom[4];
            }
            if (classes == clastax[5]) {
                cla = clasprozWom[5];
            }
            if (cla > clasprozWom[0]) {
                res = salary / cla;
                return res;
            } else {
                return 0;
            }

        }
        return cla;
    }

    public static double marry(boolean sex, boolean marry,double salary){
        double marryProz=0;
        if (marry==true&& sex == true){marryProz=salary/4;}
        if (marry==true&& sex == false){marryProz=salary/2;}
        if (marry==false&& sex == true){marryProz=0;}
        if (marry==false&& sex == false){marryProz=0;}
        return marryProz;

    }

public static double childer(int  kids, boolean sex, boolean marry, double  salary){
        double[] kidsManProz={2, 8};
        double[] kidsWomProz={2, 1};
        double kidsProtz=0;
    if (marry==true&& sex == true){kidsProtz=salary/(kidsManProz[0]*kids);}
    if (marry==true&& sex == false){kidsProtz=salary/(kidsWomProz[0]*kids);}
    if (marry==false&& sex == true){kidsProtz=salary/(kidsManProz[1]*kids);}
    if (marry==false&& sex == false){kidsProtz=salary/(kidsWomProz[1]*kids);}
return kidsProtz;

}

}