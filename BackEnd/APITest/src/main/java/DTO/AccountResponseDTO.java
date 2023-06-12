package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AccountResponseDTO {
    private Long id;
    private String iban;
    private String accountType;
    //private CardResponseDTO cardResponseDTO;

}
