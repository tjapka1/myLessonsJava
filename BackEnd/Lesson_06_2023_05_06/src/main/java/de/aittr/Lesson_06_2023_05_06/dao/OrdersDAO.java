package de.aittr.Lesson_06_2023_05_06.dao;

import de.aittr.Lesson_06_2023_05_06.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {

    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>(
                List.of(new Order(1, 1, 3),
                        new Order(3, 1, 1),
                        new Order(1, 2, 3),
                        new Order(3, 3, 2),
                        new Order(4, 2, 2),
                        new Order(2, 3, 1),
                        new Order(4, 1, 4),
                        new Order(3, 2, 2)
                ));
        return orders;
    }
}
