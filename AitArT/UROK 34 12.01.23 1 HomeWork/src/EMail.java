public class EMail implements Send{
    @Override
    public void send() {
        sendFunk1();
        sendFunk2();
   //     sendFunk3();
    }

    private void sendFunk1(){
        System.out.println("Задаю комент ");
    }
    private void sendFunk2(){
        System.out.println("Отправляю");
    }
    /*
    private  void sendFunk3(){
        System.out.println("клею марку");
    }
*/
}
