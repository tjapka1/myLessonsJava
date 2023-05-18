package de.aittr.Lesson_06_2023_05_06.dao;

import de.aittr.Lesson_06_2023_05_06.entity.Order;
import de.aittr.Lesson_06_2023_05_06.entity.User;

import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {
    List <Order> orders;
    public List<Order> getOrders() {
        orders=new ArrayList<>(List.of(
                new Order(new User("Wasja"), "Milk"),
                new Order(new User("Witja"), "brat"),
                new Order(new User("Wasja"), "brat"),
                new Order(new User("Kasja"), "Milk"),
                new Order(new User("Gasja"), "EI"),
                new Order(new User("Wasja"), "Ei")
        ));
        return orders;
    }
}
