package de.aittr.bd1.dto;

import de.aittr.bd1.entity.CardType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardRequestDTO {
    private String number;
    private CardType cardType;
    private Long accountId;
}
