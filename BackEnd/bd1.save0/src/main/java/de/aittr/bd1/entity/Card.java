package de.aittr.bd1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cards")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "number")
    private String number;
    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL)
    private Account account;
    @Column(name = "cardType")
    private CardType cardType;

}
