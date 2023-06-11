package DTO;

import lombok.*;


@Setter
@Getter
@ToString
@Builder
public class AddressResponseDTO {
    private Long id;
    private String street;
    private int houseNumber;
    private String city;
}
