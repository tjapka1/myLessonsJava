package deAit.model;

public class Employer {
    public int id;
    public String name;
    public double salary;
    public double taxAllowance;
    public double bankBalance;

public void displayEmployer(){
    System.out.println("ID: "+id+", "+"Name: "+name+", "+"Salary "+salary+", "+"TaxAllowance "+taxAllowance);
    System.out.println("Bank Balance " + bankBalance);
    //System.out.println("***************************************************");
}
public void showNettoSalaryEmployer(){
    System.out.println(name+" "+"Netto salary is " + (salary-taxAllowance));
    System.out.println("***************************************************");
}

}