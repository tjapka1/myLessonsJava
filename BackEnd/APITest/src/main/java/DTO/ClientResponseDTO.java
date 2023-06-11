package DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@Builder
public class ClientResponseDTO {
    private Long id;
    private String name;
    //private List<AccountResponseDTO> accounts;
    //private List<AddressResponseDTO> addresses;
}
