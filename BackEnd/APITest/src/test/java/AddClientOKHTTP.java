
import DTO.ClientRequestDTO;
import DTO.ClientResponseDTO;
import com.google.gson.Gson;
import lombok.Data;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

@Data
public class AddClientOKHTTP {
    private final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson =new Gson();
    OkHttpClient client = new OkHttpClient();

    @Test
    public void AddClientSuccessTest() throws IOException {
        int i = new Random().nextInt(1000)+1000;
        ClientRequestDTO clientDto = ClientRequestDTO.builder().name("Vason"+i).build();

        RequestBody body = RequestBody.create(gson.toJson(clientDto),JSON);
        Request request = new Request.Builder()
                .url("http://localhost:8080/clients")
                                .post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        ClientResponseDTO clientResponseDTO = gson.fromJson(response.body().string(), ClientResponseDTO.class);
        System.out.println(clientResponseDTO.getId());
        System.out.println(clientResponseDTO.getName());
       Assert.assertTrue(clientResponseDTO.getName().contains("Vason"+i));

}






}
