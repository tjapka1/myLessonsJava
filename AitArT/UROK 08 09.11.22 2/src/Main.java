public class Main {
    public static void main(String[] args) {

        int userNr =380;
        userNrm(userNr);
        userNrm1(userNr);




    }
    public static int  userNrm(int userNr){
        if(userNr<=200 && userNr>=-200){
            System.out.println("ok");
                    }
        if (userNr<-200){
            System.out.println("min");
        }
        if (userNr>200){
            System.out.println("plus");
        }
        return 0;

    }
    public static int  userNrm1(int userNr){
        if (userNr>200){
            System.out.println("plus");
        }
        else if (userNr<-200){
            System.out.println("Min");
        }
        else {
            System.out.println("ok");
        }
        return 0;

    }
}
//  Пользователь вводит число
// если оно больше 200, выводим +
// если оно меньше -200, выводим -
// если оно между - выводим ок

