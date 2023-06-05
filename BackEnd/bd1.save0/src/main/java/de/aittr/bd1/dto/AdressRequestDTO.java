package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdressRequestDTO {
    private String street;
    private int houseNumber;
    private String city;
}
