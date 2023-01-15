public class Owl implements MailDeliveryService {
    @Override
    public void sendmail() {
        sendFunk1();
        sendFunk2();
        sendFunk3();
    }

    private void sendFunk1(){
        System.out.println("Привязываю письмо в ноге ");
    }
    private void sendFunk2(){
        System.out.println("Даю Корма");
    }
    private  void sendFunk3(){
        System.out.println("отправляю в полёт");
    }

    @Override
    public String name (){
        return "Owl";
    }
    @Override
    public String toString (){
        return "Owl";
    }

}
