package de.ait.city.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }
}
