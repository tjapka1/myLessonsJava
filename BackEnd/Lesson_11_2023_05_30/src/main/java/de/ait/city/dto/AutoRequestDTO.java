package de.ait.city.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoRequestDTO {
    private String brand;
    private String plate;
    private  int year;

}
