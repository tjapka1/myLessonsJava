/*
Homework 07.11.22
Alexander Geier

 */
public class Main {
    public static void main(String[] args) {

        int car1Speed = 150;
        int car1DriveLine = 70;
        int car1Points = 0;
        if (car1Speed > car1DriveLine) {
            System.out.println("Car1 drive in Zone " + car1DriveLine + "  at speed " + car1Speed + " Kmh ");
            double car1DifSpeed = fine(car1Speed, car1DriveLine);
            double car1Many = many(car1DifSpeed);
            System.out.println("your penalty is " + car1Many + " Eur");
            System.out.println("You have " + car1Points + " Poinst ins Flensburg");
            double car1punkt = punkt(car1DifSpeed);
            System.out.println("your get " + car1punkt + " Poinst ins Flensburg");
            double new1Points = car1Points + car1punkt;
            System.out.println("You new Stand in Flensburg is " + new1Points + " Points");

        } else {
            System.out.println("Car1 drive at a great speed " + car1Speed + " Kmh in Zone " + car1DriveLine);
        }

        int car2Speed = 150;
        int car2DriveLine = 100;
        int car2Points = 0;
        if (car2Speed > car2DriveLine) {
            System.out.println("Car2 drive in Zone " + car2DriveLine + "  at speed " + car2Speed + " Kmh ");
            double car2DifSpeed = fine(car2Speed, car2DriveLine);
            double car2Many = many(car2DifSpeed);
            System.out.println("your penalty is " + car2Many + " Eur");
            double car2punkt = punkt(car2DifSpeed);
            System.out.println("your get " + car2punkt + " Poinst ins Flensburg");
            double new2Points = car2Points + car2punkt;
            System.out.println("You new Stand in Flensburg is " + new2Points + " Points");
        } else {
            System.out.println("Car 2 drive at a great speed " + car2Speed + " Kmh" + " Kmh in Zone " + car2DriveLine);
        }


        // s
        // speed 0-10 -> 10 Euro  -> *0 points
        // speed 11-20 -> 30 Euro -> *0 points
        // speed 21-30 -> 50 Euro -> *1 point
        // speed 31-100 -> 1000 Euro -> *2 point

        // *Calculate points
    }

    public static double fine(int speed, int carDriveLine) {
        int carDriveLine1 = 70;
        int carDriveLine2 = 100;
        int carDriveLine3 = 130;
        if (carDriveLine == carDriveLine1) {
            double excessSpeed1 = speed - carDriveLine1;
            System.out.println(" You increased the Speed of " + excessSpeed1 + " Kmh");
            return excessSpeed1;

        }
        if (carDriveLine == carDriveLine2) {
            double excessSpeed2 = speed - carDriveLine2;
            System.out.println("You increased the Speed " + excessSpeed2 + " Kmh");
            return excessSpeed2;
        }
        if (speed > carDriveLine3) {
            double excessSpeed3 = speed - carDriveLine3;
            System.out.println("You increased the Speed " + excessSpeed3 + " Kmh");
            return excessSpeed3;

            //return 0;
        }

        return 0;
    }

    public static double many(double carDifSpeed) {
        if (carDifSpeed >= 0 && carDifSpeed <= 10) {
            double a = 10;
            return a;
        }
        if (carDifSpeed >= 11 && carDifSpeed <= 20) {
            double b = 30;
            return b;
        }
        if (carDifSpeed >= 21 && carDifSpeed <= 30) {
            double c = 50;
            return c;
        }
        if (carDifSpeed >= 31 && carDifSpeed <= 1000) {
            double e = 1000;
            return e;
        }
        return 0;

    }

    public static double punkt(double carDifSpeed) {
        if (carDifSpeed >= 0 && carDifSpeed <= 10) {
            double a = 0;
            return a;
        }
        if (carDifSpeed >= 11 && carDifSpeed <= 20) {
            double b = 0;
            return b;
        }
        if (carDifSpeed >= 21 && carDifSpeed <= 30) {
            double c = 10;
            return c;
        }
        if (carDifSpeed >= 31 && carDifSpeed <= 1000) {
            double e = 2;
            return e;
        }
        return 0;


    }
}