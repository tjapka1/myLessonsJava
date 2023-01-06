package aitDe.models;

import java.text.DecimalFormat;

public class Personal {
    private int id;//*
    private String firstname;//*
    private String lastname;//*
    private boolean sex;//*
    private boolean marry;//*
    private double marryManny;
    private int kids;//*
    private double kidsManny;
    private double nettoSalary;//*
    private double tax;
    private double taxEur;
    private double salaryMinTax;
    private int classes;//*
    private double classEur;
    private double salaryMinClas;
    private double pramery;//*
    private double bruttoSalary;

    public double getNettoSalary() {
        return nettoSalary;
    }

    public double getKidsManny() {
        return kidsManny;
    }

    public void setKidsManny(double kidsManny) {
        this.kidsManny = kidsManny;
    }

    public void setNettoSalary(double nettoSalary) {
        this.nettoSalary = nettoSalary;
    }

    public double getBruttoSalary() {
        return bruttoSalary;
    }

    public void setBruttoSalary(double bruttoSalary) {
        this.bruttoSalary = bruttoSalary;
    }



    public Personal(int id, String firstname, String lastname, boolean sex, boolean marry, int kids, double salary, int classes, double pramery) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.marry = marry;
        this.kids = kids;
        this.nettoSalary=salary;
        this.classes = classes;
        this.pramery = pramery;
    }

    public Personal(int id, String firstname, String lastname, boolean sex, boolean marry, double marryManny, int kids, double kidsManny, double salary, double tax, double taxEur, double salaryMinTax, int classes, double classEur, double salaryMinClas, double pramery) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.marry = marry;
        this.marryManny=marryManny;
        this.kids = kids;
        this.kidsManny = kidsManny;
        this.nettoSalary = salary;
        this.tax = tax;
        this.taxEur = taxEur;
        this.salaryMinTax = salaryMinTax;
        this.classes = classes;
        this.classEur = classEur;
        this.salaryMinClas = salaryMinClas;
        this.pramery = pramery;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }

    public double getMarryManny() {
        return marryManny;
    }

    public void setMarryManny(double marryManny) {
        this.marryManny = marryManny;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public double getSalary() {
        return nettoSalary;
    }

    public void setSalary(double salary) {
        this.nettoSalary = salary;
    }

    public double getTax() {
               return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTaxEur() {

        return taxEur;
    }

    public void setTaxEur(double taxEur) {
              this.taxEur = taxEur;
    }

    public double getSalaryMinTax() {
        return salaryMinTax;
    }

    public void setSalaryMinTax(double salaryMinTax) {
               this.salaryMinTax = salaryMinTax;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {

        this.classes = classes;
    }

    public double getClassEur() {
        return classEur;
    }

    public void setClassEur(double classEur) {
            this.classEur = classEur;
    }

    public double getSalaryMinClas() {
         return salaryMinClas;
    }

    public void setSalaryMinClas(double salaryMinClas) {
        this.salaryMinClas = salaryMinClas;
    }

    public double getPramery() {
        return pramery;
    }

    public void setPramery(double pramery) {
        this.pramery = pramery;
    }

    DecimalFormat df=new DecimalFormat(".00");
    @Override
    public String toString() {
        return
                "id=" + id +
                " * firstname=" + firstname +
                " * lastname=" + lastname +
                " * sex=" + sex +
                " * marry=" + marry +
                " * kids=" + kids +
                " * Netto salary=" + df.format(nettoSalary) +
                " * tax=" + tax +
                " * taxEur=" + df.format(taxEur) +
                " * salaryMinTax=" + df.format(salaryMinTax) +
                " * classes=" + classes +
                " * classEur=" + df.format(classEur) +
                " * salaryMinClas=" + df.format(salaryMinClas) +
                " * pramery=" + df.format(pramery)+
                " * Brutto salary="+ df.format(bruttoSalary);

    }
}