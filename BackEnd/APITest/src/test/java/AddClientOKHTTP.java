
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
    public void AddClientSuccessTest() throws IOException {
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
        aadClientAddressWork(clientResponseDTO.getId());
        aadClientAddressHome(clientResponseDTO.getId());
        System.out.println("-----------Accounts------------");
        aadClientAccountDebit(clientResponseDTO.getId());
        aadClientAccountCredit(clientResponseDTO.getId());
        Assert.assertTrue(clientResponseDTO.getName().contains("Vason"+i));

}

    private void aadClientAccountDebit(Long id) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AccountRequestDTO accountDTO = AccountRequestDTO.builder().iban("DE"+i).accountType("DEBIT").build();

        RequestBody body = RequestBody.create(gson.toJson(accountDTO),JSON);
        Request request = new Request.Builder().url("http://localhost:8080/clients/"+idIntern+"/accounts").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AccountResponseDTO accountResponseDTO = gson.fromJson(response.body().string(), AccountResponseDTO.class);
        System.out.println(accountResponseDTO.getId());
        System.out.println(accountResponseDTO.getAccountType());
        System.out.println(accountResponseDTO.getIban());
        System.out.println("----------------------");
    }

    private void aadClientAccountCredit(Long id) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AccountRequestDTO accountDTO = AccountRequestDTO.builder().iban("DE"+i).accountType("CREDIT").build();

        RequestBody body = RequestBody.create(gson.toJson(accountDTO),JSON);
        Request request = new Request.Builder().url("http://localhost:8080/clients/"+idIntern+"/accounts").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AccountResponseDTO accountResponseDTO = gson.fromJson(response.body().string(), AccountResponseDTO.class);
        System.out.println(accountResponseDTO.getId());
        System.out.println(accountResponseDTO.getAccountType());
        System.out.println(accountResponseDTO.getIban());
        addCardVisa(accountResponseDTO.getId());
        System.out.println("----------------------");
    }

    private void addCardVisa(Long id) {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;

    }

    @Test
    private void aadClientAddressWork(Long id) throws IOException {
        Long idIntern = id;
        //if (id >= 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AddressRequestDTO addressDTO = AddressRequestDTO.builder().addressType("WORK").houseNumber(i).street("derebasovskaja").city("Odessa").build();

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


    private void aadClientAddressHome(Long id) throws IOException {
        Long idIntern = id;
        //if (id < 0){idIntern=id;}
        int i = new Random().nextInt(1000)+1000;
        AddressRequestDTO addressDTO = AddressRequestDTO.builder().addressType("HOME").houseNumber(i).street("Myasoedovskaja").city("Odessa").build();

        RequestBody body = RequestBody.create(gson.toJson(addressDTO),JSON);
        Request request = new Request.Builder().url("http://localhost:8080/clients/"+idIntern+"/address").post(body).build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AddressResponseDTO addressResponseDTO = gson.fromJson(response.body().string(), AddressResponseDTO.class);
        System.out.println(addressResponseDTO.getAddressType());
        System.out.println(addressResponseDTO.getCity());
        System.out.println(addressResponseDTO.getStreet());
        System.out.println(addressResponseDTO.getHouseNumber());
        System.out.println("------------------");

    }


}
