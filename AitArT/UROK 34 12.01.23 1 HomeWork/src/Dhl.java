public class Dhl  implements MailDeliveryService {
    @Override
    public void sendmail() {
        sendFunk1();
        sendFunk2();
        sendFunk3();
    }

    private void sendFunk1(){
        System.out.println("кладу письмо в конверт ");
    }
    private void sendFunk2(){
        System.out.println("клею марку");
    }
    private  void sendFunk3(){
        System.out.println("иду на  почту");
    }
    @Override
    public String name (){
        return "Dhl";
    }

    @Override
    public String toString (){
        return "Dhl";
    }

}
