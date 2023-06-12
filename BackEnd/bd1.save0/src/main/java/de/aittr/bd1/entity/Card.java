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
    @ManyToOne()
    @JoinColumn(name = "account_Id")
    private Account account;
    @Convert(converter = CardTypeConverter.class)
    @Column(name = "cardType")
    private CardType cardType;

}
