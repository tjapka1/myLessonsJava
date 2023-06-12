package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CardRequestDTO {
    private String number;
    private String cardType;
    private Long accountId;
}
