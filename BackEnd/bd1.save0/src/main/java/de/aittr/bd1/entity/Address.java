package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

   // @Convert(converter = AddressType.class)
    @Column(name = "addressType")
    private AddressType addressType;

    @Column(name = "street")
    private String street;

    @Column(name = "houseNumber")
    private int houseNumber;

    @Column(name = "city")
    private String city;

    @ManyToMany
    @JoinTable(
            name = ("client_address"),
            joinColumns = @JoinColumn(name = "address_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private List<Client> clients;
}
