package de.ait.city.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoResponseDTO {
    private Long id;
    private String brand;
    private String plate;
    private  int year;

}
