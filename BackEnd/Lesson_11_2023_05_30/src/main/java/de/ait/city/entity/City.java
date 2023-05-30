package de.ait.city.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table (name = "town")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "population")
    private int population;
    @Column(name = "area")
    private double area;

    public City(String name, String country, int population, double area) {
    }
}
