import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {
    public static void main(String[] args) {
            Elements obj1=new Elements();
            obj1.start();

            Elements obj2 =new Elements();
            obj2.start();

            Thread obj3 =new Thread(new NewTest());
            obj3.start();
           Thread obj4 =new Thread(new NewTest());
           obj4.start();
           Thread obj5 =new Thread(new NewTest());
           obj5.start();

           Thread obj6 = new Thread(new Runnable() {
               @Override
               public void run() {
                   for (int i = 0; i < 10; i++) {
                       System.out.println("Main Элемент: "+i);
                   }
               }
           });
           obj6.start();
        try {
            URL website=new URL("http://google.com");
            ReadableByteChannel rbc= Channels.newChannel(website.openStream());
            FileOutputStream file= new FileOutputStream("data.html");
            file.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}