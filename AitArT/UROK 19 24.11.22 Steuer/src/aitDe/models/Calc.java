package aitDe.models;

public class Calc {

    public static double calcTax(double salary, double tax) {
        double res = (salary / tax);
        if (tax == 0) {
            res = 1;
        }
        return res;
    }

    public static double selMinTax(double salary, double res) {
        double res1 = (salary - res);
        if (res == 1) {
            res1 = salary;
        }
        return res1;
    }

    public static double classesMin(double selary, double cassEur) {
        double res = selary - cassEur;
        return res;
    }

    public static double Brutto(double salaryMinClass, double premary, double marryManny, double kidsManny) {
        double res = salaryMinClass;
        if (premary >= 0 || marryManny>0 || kidsManny>0) {
            res = salaryMinClass + premary+marryManny-kidsManny;
        }

        return res;
    }

}
