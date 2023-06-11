package de.aittr.bd1.dto;

import de.aittr.bd1.entity.AddressType;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressResponseDTO {
    private Long id;
    private AddressType addressType;
    private String street;
    private int houseNumber;
    private String city;
}
