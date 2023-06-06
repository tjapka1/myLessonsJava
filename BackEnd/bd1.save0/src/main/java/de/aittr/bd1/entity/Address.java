package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "houseNumber")
    private int houseNumber;

    @Column(name = "city")
    private String city;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
