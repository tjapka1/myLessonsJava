package DTO;

import lombok.*;


@Setter
@Getter
@ToString
@Builder
public class AddressRequestDTO {
    private String street;
    private int houseNumber;
    private String city;
}
