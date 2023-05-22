package de.aittr.Lesson_06_2023_05_06.entity;

import java.util.Objects;

public class User {
    private static int count=0;
    private int id;
    private String name;
    private String city;


    public User() {
        this.id=++count;
    }

    public User(String name) {
        this();
        this.name = name;
    }

    public User(String name, String city) {
        this();
        this.name = name;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
