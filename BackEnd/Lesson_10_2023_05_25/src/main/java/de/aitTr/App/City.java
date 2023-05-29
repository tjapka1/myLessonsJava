package de.aitTr.App;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter

@EqualsAndHashCode
@Builder

@Entity
@Table(name = "city")
public class City {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private long id;
@Schema ( description = "Название гоhода", type = "string")
@Column(name="name")
private String name;
@Column(name = "country")
private String country;
@Column(name = "population")
private  int population;
@Column(name = "Square")
private double square;


    public City() {

    }
}
