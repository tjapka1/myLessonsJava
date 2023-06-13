import DTO.AllClientsDTO;
import DTO.ClientResponseDTO;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllContacs {
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();
    private final static String URL = "http://localhost:8080/clients";


    @Test
    public void getAllClients(){
        List<AllClientsDTO> allClientsDTOS=given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL)
                .then()
                .log()
                .all()
                .extract().body().jsonPath().getList("ClientResponseDTO", AllClientsDTO.class);
    }


    @Test
    public void getAllClientsSuccess() throws IOException {
        Request request = (new Request.Builder()).url("http://localhost:8080/clients").get().build();
        Response response = this.client.newCall(request).execute();
        System.out.println("bvcx   "+ response.body().toString());
        //Assert.assertTrue(response.isSuccessful());

        AllClientsDTO allClientsDTO = (AllClientsDTO)this.gson.fromJson(response.body().string(), AllClientsDTO.class);
        System.out.println(allClientsDTO.getClients().size());
 /*
        List<ClientResponseDTO> clients = allClientsDTO.getClients();


        for (ClientResponseDTO client : clients) {
            System.out.println(client.getId());
            //System.out.println(client.getAccounts().get(1).);
            //PrintStream var10000 = System.out;
            String var10001 = client.getName();
            //var10000.println(var10001);
            System.out.println("==================================================");
   }
*/

    }

 }