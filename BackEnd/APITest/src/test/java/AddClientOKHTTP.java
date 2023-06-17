
import DTO.*;
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
    public void addMoreClients(int clients) throws IOException {
        clients=12;
        int count=0;
    while (clients==count) {
            addClientSuccessTest();
            count++;
        }
    }
  @Test
    public void addClientSuccessTest() throws IOException {
        int i = new Random().nextInt(1000)+1000;
        int j = new Random().nextInt(20)+10;
        ClientRequestDTO clientDto = ClientRequestDTO.builder().clientStatus("").name("Vason"+i).age(j).build();

        RequestBody body = RequestBody.create(gson.toJson(clientDto),JSON);
        Request request = new Request.Builder()
                .url("http://localhost:8080/clients")
                                .post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        ClientResponseDTO clientResponseDTO = gson.fromJson(response.body().string(), ClientResponseDTO.class);
        System.out.println("ID: "+clientResponseDTO.getId());
        System.out.println(clientResponseDTO.getName());
        System.out.println("Year: "+clientResponseDTO.getAge());
        System.out.println("-----------Addresses------------");
        aadClientAddress(clientResponseDTO.getId(), "WORK");
        aadClientAddress(clientResponseDTO.getId(), "HOME");
        System.out.println("-----------Accounts------------");
        aadClientAccount(clientResponseDTO.getId(), "DEBIT");
        aadClientAccount(clientResponseDTO.getId(), "CREDIT");
        Assert.assertTrue(clientResponseDTO.getName().contains("Vason"+i));

}
    private void aadClientAccount(Long id, String accountType) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AccountRequestDTO accountDTO = AccountRequestDTO.builder().iban("DE"+i).accountType(accountType).build();

        RequestBody body = RequestBody.create(gson.toJson(accountDTO),JSON);
        Request request = new Request.Builder().url("http://localhost:8080/clients/"+idIntern+"/accounts").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AccountResponseDTO accountResponseDTO = gson.fromJson(response.body().string(), AccountResponseDTO.class);
        System.out.println(accountResponseDTO.getId());
        System.out.println(accountResponseDTO.getAccountType());
        System.out.println(accountResponseDTO.getIban());
        addCard(accountResponseDTO.getId(), "GIRO");
        addCard(accountResponseDTO.getId(), "VISA");
        addCard(accountResponseDTO.getId(), "MAESTRO");
        addCard(accountResponseDTO.getId(), "MASTERCARD");
        System.out.println("----------------------");
        }

    private void addCard(Long id, String typeCard) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        CardRequestDTO cardRequestDTO = CardRequestDTO.builder().cardType(typeCard).number("DE2323"+i).accountId(idIntern).build();

        RequestBody body = RequestBody.create(gson.toJson(cardRequestDTO), JSON);
        Request request = new Request.Builder().url("http://localhost:8080/cards").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

      /*  CardResponseDTO cardResponseDTO = gson.fromJson(response.body().string(), CardResponseDTO.class);

       // System.out.println(cardResponseDTO.getId());
        System.out.println(cardResponseDTO.getCardType());
        System.out.println(cardResponseDTO.getNumber());
*/
    }

    private void aadClientAddress(Long id, String addressStatus) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AddressRequestDTO addressDTO = AddressRequestDTO.builder().addressType(addressStatus).houseNumber(i).street("derebasovskaja").city("Odessa").build();

        RequestBody body = RequestBody.create(gson.toJson(addressDTO),JSON);
        Request request = new Request.Builder().url("http://localhost:8080/clients/"+idIntern+"/address").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AddressResponseDTO addressResponseDTO = gson.fromJson(response.body().string(), AddressResponseDTO.class);
        System.out.println(addressResponseDTO.getAddressType());
        System.out.println(addressResponseDTO.getCity());
        System.out.println(addressResponseDTO.getStreet());
        System.out.println(addressResponseDTO.getHouseNumber());
        System.out.println("--------------------------------------");

    }

}
