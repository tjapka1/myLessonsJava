package de.aittr.bd1.dto;

import de.aittr.bd1.entity.ClientStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientRequestDTO {
    private ClientStatus clientStatus;
    private String name;

    //private AccountRequestDTO account;
    //private AddressRequestDTO address;
}
