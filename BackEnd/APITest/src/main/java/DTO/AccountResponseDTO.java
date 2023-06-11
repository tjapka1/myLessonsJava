package DTO;

import lombok.*;


@Setter
@Getter
@ToString
@Builder
public class AccountResponseDTO {
    private Long id;
    private String iban;

}
