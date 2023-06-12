package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    @Convert(converter = AccountTypeConverter.class)
    @Column(name = "accountType")
    private AccountType accountType;

    /*
    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Client client;
    */
    @ManyToMany()
    @JoinTable(
            name = ("client_account"),
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    //@JoinColumn(name = "client_id")
    private List<Client> clients;

}
