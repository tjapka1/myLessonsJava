package de.aittr.Lesson_06_2023_05_06.entity;

import java.util.Objects;

public class Product {
    private static int count = 0;

    private int id;
    private String title;
    private double price;
    private String description;

    public Product() {
        this.id = ++count;
    }

    public Product(String title) {
        this();
        this.title = title;
    }

    public Product(String title, double price, String description) {
        this();
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Objects.equals(title, product.title) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, description);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
