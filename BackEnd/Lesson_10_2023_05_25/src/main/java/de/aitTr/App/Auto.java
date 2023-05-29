package de.aitTr.App;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Schema(description = "Auto Brand", type = "string")
    @Column(name = "Brand")
    private String brand;
    @Schema(description = "AutoPlate", type = "string")
    @Column(name = "plate")
    private String plate;
    @Schema(description = "BauYear", type = "string")
    @Column(name = "Bauyaer")
    private int year;



    public Auto(String brand, String plate, int year) {
        this.brand = brand;
        this.plate = plate;
        this.year = year;
    }
}