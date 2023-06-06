package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="account")
@NoArgsConstructor
@Getter
@Setter

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name="iban")
    private String iban;

    /*
    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Client client;
    */
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
