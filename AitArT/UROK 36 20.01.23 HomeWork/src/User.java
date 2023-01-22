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

    private String checkEmail(String email)throws MyCheckedException{
        String outputEmail =" ";
        String mailDog=checkDog(email);

        outputEmail=mailDog;
        return outputEmail;
    }

    private String checkDog(String email)throws MailDogException {
        String outputEmail =" ";
        int indexOfDog=email.indexOf("@");
        try {
            if (indexOfDog>0|| indexOfDog<email.length());
        }catch (MailDogException e){
            System.out.println("");
        }
        return outputEmail;
    }


    @Override
    public String toString() {
        return firstName + ";" + lastName + ";" + age + ";" + email;
    }
}
