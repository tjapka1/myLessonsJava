public class EMail implements MailDeliveryService {
    @Override
    public void sendmail() {
        sendFunk1();
        sendFunk2();
        //     sendFunk3();
    }

    private void sendFunk1() {
        System.out.println("Задаю комент ");
    }

    private void sendFunk2() {
        System.out.println("Отправляю");
    }
    /*
    private  void sendFunk3(){
        System.out.println("клею марку");
    }
*/

    @Override
    public String name (){
        return "Email";
    }
    @Override
    public String toString (){
        return "Email";
    }
}