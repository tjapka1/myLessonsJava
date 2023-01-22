public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = checkEmail(email);
    }

    private String checkEmail(String email){
        String outputEmail =" ";
        String mailDog=checkDog(email);
        String mailPoint=checkPoint(mailDog);

        outputEmail=mailPoint;
        return outputEmail;
    }

    private String checkPoint(String mailPoint) {
        String outputEmail =" ";
        int indexOfPoint=mailPoint.indexOf(".");
        System.out.println(indexOfPoint);
        try {
            if (indexOfPoint>0||indexOfPoint<mailPoint.length()-1);
        }catch (MailDogException e){
            System.out.println("Не хватает Точки");
            outputEmail="";
        }
        outputEmail=mailPoint;
        return outputEmail;
    }

    private String checkDog(String email)throws MailDogException {
        String outputEmail =" ";
        int indexOfDog=email.indexOf("@");
        System.out.println(indexOfDog);
        try {
            if (indexOfDog>0/*|| indexOfDog < email.length()-1*/);
        }catch (MailDogException e){
            System.out.println("Не хватает @");
            outputEmail="";
        }
        outputEmail=email;
        return outputEmail;
    }


    @Override
    public String toString() {
        return firstName + ";" + lastName + ";" + age + ";" + email;
    }
}
