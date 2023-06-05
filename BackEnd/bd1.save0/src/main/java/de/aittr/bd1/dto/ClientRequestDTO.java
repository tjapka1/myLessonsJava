package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientRequestDTO {
    private String name;
    private AccountRequestDTO account;
    private AdressRequestDTO adress;
}
