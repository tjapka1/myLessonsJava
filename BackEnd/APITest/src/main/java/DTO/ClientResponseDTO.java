package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class ClientResponseDTO {
    private Long id;
    private String clientStatus;
    private String name;
    private Integer age;
    private List<AddressResponseDTO> addresses;
    private List<AccountResponseDTO> accounts;
}

