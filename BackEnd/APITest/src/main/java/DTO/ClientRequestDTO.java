package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ClientRequestDTO {
    private String clientStatus;
    private String name;

    //private AccountRequestDTO account;
    //private AddressRequestDTO address;
}
