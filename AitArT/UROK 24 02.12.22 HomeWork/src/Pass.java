import java.util.Scanner;

public class Pass {
    public static boolean checkPass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Passwort");
        String pass = sc.next();
        pass=pass.toLowerCase();
        boolean seCheck = true;
        if (pass.equals("admin")) {
            seCheck = false;
        }
        return seCheck;

    }

}
