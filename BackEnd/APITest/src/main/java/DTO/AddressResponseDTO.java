package DTO;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Builder
@Data
public class AddressResponseDTO {
    private Long id;
    private String addressType;
    private String street;
    private int houseNumber;
    private String city;
}
