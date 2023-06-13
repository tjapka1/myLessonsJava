import DTO.AllClientsDTO;
import DTO.ClientResponseDTO;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GetClientByAge {
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();
    private final static String URL = "http://localhost:8080/clients/age?age=";
    private final static String age = "6";
    @Test
    public void getAllClientsSuccess() throws IOException {
        Request request = (new Request.Builder()).url(URL+age).get().build();
        Response response = this.client.newCall(request).execute();
        System.out.println("bvcx   " + response.body().toString());
        //Assert.assertTrue(response.isSuccessful());

        AllClientsDTO allClientsDTO = (AllClientsDTO)this.gson.fromJson(response.body().string(), AllClientsDTO.class);
        System.out.println(allClientsDTO.getClients().size());

        List<ClientResponseDTO> clients = allClientsDTO.getClients();


        for (ClientResponseDTO client : clients) {
            System.out.println(client.getId());
            //System.out.println(client.getAccounts().get(1).);
            //PrintStream var10000 = System.out;
            String var10001 = client.getName();
            //var10000.println(var10001);
            System.out.println("==================================================");
        }
    }
}
