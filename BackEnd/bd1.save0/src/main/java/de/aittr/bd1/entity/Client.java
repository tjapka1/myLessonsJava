package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="client")
@NoArgsConstructor
@Getter
@Setter

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "client")
    //@JoinColumn(name = "Client_id", referencedColumnName = "id")
    private List<Account> account;

    @OneToOne(mappedBy = "client")
    //@JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    

}
