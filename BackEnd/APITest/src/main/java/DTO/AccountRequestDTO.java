package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AccountRequestDTO {
    private String iban;
    private String accountType;
    //private CardRequestDTO cardRequestDTO;

}
