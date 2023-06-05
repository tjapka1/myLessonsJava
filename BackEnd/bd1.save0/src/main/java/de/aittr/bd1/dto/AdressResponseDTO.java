package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AdressResponseDTO {
    private Long id;
    private String street;
    private int houseNumber;
    private String city;
}
