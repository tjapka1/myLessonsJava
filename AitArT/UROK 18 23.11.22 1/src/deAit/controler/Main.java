package deAit.controler;

import deAit.model.Employer;

public class Main {
    public static void main(String[] args) {

        Employer peter = new Employer(); // Создали переменную peter класса Employee
        peter.id = 3665;
        peter.name = "Peter Ivanov";
        peter.salary = 18000;
        peter.taxAllowance = 9900;
        peter.bankBalance=30000;
        peter.displayEmployer();
        peter.showNettoSalaryEmployer();

        Employer eva = new Employer();
        eva.name = "Eva Smirnoff";
        eva.id = 565;
        eva.salary = 14000;
        eva.taxAllowance = 8800;
        eva.bankBalance=25500;
        eva.displayEmployer();
        eva.showNettoSalaryEmployer();

        Employer volodya = new Employer();
        volodya.name = "Volodya Sharapow";
        volodya.id = 15655;
        volodya.salary = 14000;
        volodya.taxAllowance = 8900;
        volodya.bankBalance= 20000;
        volodya.displayEmployer();
        volodya.showNettoSalaryEmployer();

    }
}