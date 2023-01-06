import java.util.Arrays;

public class Tools {

    public static void sortAll(Account[] arr, int switcher) {
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1-i; j++) {
                switch (switcher) {
                    case 1:
                        if (soAgeMax(arr, j, j + 1)) {
                            swap(arr, j, j + 1);
                            flag = true;
                        }
                        break;
                    case 2:
                        if (soAgeMin(arr, j, j + 1)) {
                            swap(arr, j, j + 1);
                            flag = true;
                        }
                        break;
                    case 3:
                       if (soMannyMax(arr, j, j + 1)) {
                           swap(arr, j, j + 1);
                           flag = true;
                       }
                        break;
                    case 4:
                        if (soMannyMin(arr, j, j + 1)) {
                        swap(arr, j, j + 1);
                        flag = true;
                    }
                        break;
                    default:
                        System.out.println("error");
                }
            }
        }
    }

    private static void swap(Account[] arr, int j1, int j2) {
        Account temp = arr[j1];
        arr[j1] = arr[j2];
        arr[j2] = temp;
    }

    private static boolean soAgeMax(Account[] arr, int j1, int j2) {
        return arr[j1].getClient().getAge() < arr[j2].getClient().getAge();
    }

    private static boolean soAgeMin(Account[] arr, int j1, int j2) {
        return arr[j1].getClient().getAge() > arr[j2].getClient().getAge();
    }

    private static boolean soMannyMax(Account[] arr, int j1, int j2) {
        return arr[j1].getBalance() < arr[j2].getBalance();
    }

    private static boolean soMannyMin(Account[] arr, int j1, int j2) {
        return arr[j1].getBalance() > arr[j2].getBalance();
    }

    public static void printAccountsByPerson(Account[] accounts,  Person person) {
        for (Account acc:accounts){
            if (acc.getClient().equals(person) )
            System.out.println(acc);
            }
        }
    public static Account[] findAccountsByPerson(Account[] accounts,  Person person) {
        int count=0;
        for (Account acc:accounts) {
            if (acc.getClient().equals(person)) {
                count++;
            }
        }
        Account [] res=new Account[count];
        count=0;
        for (Account acc:accounts){
            if (acc.getClient().equals(person)){
                res[count++]=acc;
            }
        }
        print(res);
        return res;
    }
      public static void print(Account[] arr) {
        for (Account acc : arr){
            System.out.println(acc);
        }
    }
}
