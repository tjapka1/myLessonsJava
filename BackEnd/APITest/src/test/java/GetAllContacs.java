import DTO.AllClientsDTO;
import DTO.ClientResponseDTO;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class GetAllContacs {
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    public GetAllContacs() {
    }

    @Test
    public void getAllClientsSuccess() throws IOException {
        Request request = (new Request.Builder()).url("http://localhost:8080/clients").get().build();
        Response response = this.client.newCall(request).execute();
        System.out.println(response);
        //Assert.assertTrue(response.isSuccessful());

        AllClientsDTO allClientsDTO =this.gson.fromJson(response.body().string(), AllClientsDTO.class);
        System.out.println(allClientsDTO);
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
