package de.aittr.Lesson_06_2023_05_06.entity;

import java.util.Objects;

public class Order {
    private static int count=0;
    private int orderID;
    private User user;

    private String productName;

    public Order(User user, String productName) {
        this.orderID = ++count;
        this.user = user;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && Objects.equals(user, order.user) && Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, user, productName);
    }

    public static int getCount() {
        return count;
    }

    public int getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }
}
