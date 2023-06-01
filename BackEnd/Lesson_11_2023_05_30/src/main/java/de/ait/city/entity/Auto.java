package de.ait.city.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "plate")
    private String plate;
    @Column(name = "bauyaer")
    private  int year;

    public Auto(String brand, String plate, int year) {
        this.brand = brand;
        this.plate = plate;
        this.year = year;
    }
}
