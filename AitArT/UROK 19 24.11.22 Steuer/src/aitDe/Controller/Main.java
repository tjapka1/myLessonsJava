package aitDe.Controller;

import aitDe.models.Calc;
import aitDe.models.FamTax;
import aitDe.models.Personal;
import aitDe.models.Taxes;

public class Main {
    public static void main(String[] args) {

     Personal a1= new Personal(0, "Natalie", "Geier", false, true, 2, 140000, 1,  0);
     a1.setTax(Taxes.Taxes(a1.getSalary()));
     a1.setTaxEur(Calc.calcTax(a1.getSalary(),a1.getTax()));
     a1.setSalaryMinTax(Calc.selMinTax(a1.getSalary(),a1.getTaxEur()));
     a1.setClassEur(FamTax.prozClass(a1.isSex(),a1.getClasses(), a1.getSalary()));
     a1.setSalaryMinClas(Calc.classesMin(a1.getSalaryMinTax(),a1.getClassEur()));
     a1.setMarryManny(FamTax.marry(a1.isSex(),a1.isMarry(),a1.getSalary()));
     a1.setKidsManny(FamTax.childer(a1.getKids(),a1.isSex(),a1.isMarry(),a1.getSalary()));
      a1.setBruttoSalary(Calc.Brutto(a1.getSalaryMinClas(),a1.getPramery(), a1.getMarryManny(),a1.getKidsManny()));
     System.out.println(a1.toString());
     Personal a2=new Personal(01, "Paul", "Tarakan", true, false, 1, 12000, 1, 0.00 );
        a2.setTax(Taxes.Taxes(a2.getSalary()));
        a2.setTaxEur(Calc.calcTax(a2.getSalary(),a2.getTax()));
        a2.setSalaryMinTax(Calc.selMinTax(a2.getSalary(),a2.getTaxEur()));
        a2.setClassEur(FamTax.prozClass(a2.isSex(), a2.getClasses(), a2.getSalary()));
        a2.setSalaryMinClas(Calc.classesMin(a2.getSalaryMinTax(),a2.getClassEur()));
        a2.setKidsManny(FamTax.childer(a2.getKids(),a2.isSex(),a2.isMarry(),a2.getSalary()));
        a2.setBruttoSalary(Calc.Brutto(a2.getSalaryMinClas(),a2.getPramery(), a2.getMarryManny(),a2.getKidsManny()));
        System.out.println(a2.toString());



    }
}