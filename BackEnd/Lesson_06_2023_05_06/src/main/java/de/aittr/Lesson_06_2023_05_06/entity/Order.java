package de.aittr.Lesson_06_2023_05_06.entity;

import java.util.Objects;

public class Order {
    private static int count=0;
    private int orderID;
    private int userID;
    private int productID;
    private int quantity;

    public Order(int userId, int productID, int quantity) {
        this.orderID = ++count;
        this.userID = userId;
        this.productID=productID;
        this.quantity=quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && userID == order.userID && productID == order.productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, userID, productID);
    }

    public int getOrderID() {
        return orderID;
    }

    public int getUserID() {
        return userID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }
}
