package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CardResponseDTO {
    private Long id;
    private String number;
    private String cardType;
    private AccountResponseDTO account;
}
