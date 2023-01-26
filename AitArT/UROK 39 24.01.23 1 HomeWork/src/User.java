import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;


    public User(String userString) throws UserCreateException {
        List<String> errList = new ArrayList<>();
        if (userString == null || userString.isEmpty()) {
            errList.add("The user string is NULL or empty");
            throw new UserCreateException(errList);
        }
        parseString(userString, errList);
        if (errList.size() != 0) throw new UserCreateException(errList);
    }

    private void parseString(String userString, List<String> errList) {
        String[] arr = userString.split(";");
        if (arr.length != 4) {
            errList.add("The string: <" + userString +
                    "> has wrong number of fields");
            return;
        }

        if (!isNotNullOrEmpty(arr[0])) {
            errList.add("The firstName  : <" + arr[0] +
                    "> not correct");
        } else {
            this.firstName = arr[0];
        }

        if (!isNotNullOrEmpty(arr[1])) {
            errList.add("The lastName  : <" + arr[1] +
                    "> not correct");
        } else {
            this.lastName = arr[1];
        }

        try {
            this.age = parseAge(arr[2]);
        } catch (Exception e) {
            errList.add("The age  : <" + arr[2] +
                    "> not correct");
        }

        if (!checkEmail(arr[3])) {
            errList.add("The email  : <" + arr[3] +
                    "> not correct");
        } else {
            this.email = arr[3];
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


    private boolean checkEmail(String email) {
        return isNotNullOrEmpty(email) &&
                email.length() > 4 &&
                email.contains("@");
    }

    private int parseAge(String age) throws Exception {
        /*
        if (!isNotNullOrEmpty(age)){
            throw new Exception();
        }
        */
        int res = Integer.parseInt(age);
        if (res < 0 || res > 200) throw new Exception();
        return res;
    }


    private boolean isNotNullOrEmpty(String str) {
        return str != null && !str.isEmpty();
    }
}