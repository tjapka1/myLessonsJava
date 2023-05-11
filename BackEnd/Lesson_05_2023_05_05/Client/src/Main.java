import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8080)){
            socket.getOutputStream().write("HI from client".getBytes());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}