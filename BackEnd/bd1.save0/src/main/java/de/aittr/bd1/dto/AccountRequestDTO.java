package de.aittr.bd1.dto;

import de.aittr.bd1.entity.AccountType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRequestDTO {
    private String iban;
    private AccountType accountType;
    //private CardRequestDTO cardRequestDTO;

}
