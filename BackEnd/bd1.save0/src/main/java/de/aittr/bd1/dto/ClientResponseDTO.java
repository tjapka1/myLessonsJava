package de.aittr.bd1.dto;

import de.aittr.bd1.entity.ClientStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ClientResponseDTO {
    private Long id;
    private ClientStatus clientStatus;
    private String name;
    private List<AccountResponseDTO> accounts;
    private List<AddressResponseDTO> addresses;
}

