package DTO;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AddressRequestDTO {
    private String addressType;
    private String street;
    private int houseNumber;
    private String city;
}
