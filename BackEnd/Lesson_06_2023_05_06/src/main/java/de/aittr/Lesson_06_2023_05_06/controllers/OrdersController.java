package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.OrdersDAO;
import de.aittr.Lesson_06_2023_05_06.dao.UsersDAO;
import de.aittr.Lesson_06_2023_05_06.entity.Order;
import de.aittr.Lesson_06_2023_05_06.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class OrdersController {
    private OrdersDAO ordersDAO =new OrdersDAO();
    private List<Order> orders = ordersDAO.getOrders();
    @GetMapping(value = "/orders")
    public String orderList( Model model){
        List <Order> res =orders;

        model.addAttribute("orders", res);
        return "orders";
    }
}
