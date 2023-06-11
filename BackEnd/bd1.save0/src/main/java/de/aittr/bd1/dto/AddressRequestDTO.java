package de.aittr.bd1.dto;

import de.aittr.bd1.entity.AddressType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressRequestDTO {
    private AddressType addressType;
    private String street;
    private int houseNumber;
    private String city;
}
