package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.OrdersDAO;
import de.aittr.Lesson_06_2023_05_06.dao.UsersDAO;
import de.aittr.Lesson_06_2023_05_06.entity.Order;
import de.aittr.Lesson_06_2023_05_06.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class OrderController {
    private UsersDAO usersDAO=new UsersDAO();
    private List <User> users = usersDAO.getUsers();
    private OrdersDAO ordersDAO = new OrdersDAO();
    private List<Order> orders =ordersDAO.getOrders();
    @GetMapping(value = "/orders")
    public String orderList( Model model){
        List <Order> res = orders;
        model.addAttribute("orders", res);
        return "orders";
    }
    @GetMapping(value = "users/{id}/orders")
    public String userOrdersById(@PathVariable int id, Model model){
        List<Order> orderList = orders;
        orderList=orderList.stream().filter(order -> order.getUser().getId() == id).toList();
        model.addAttribute("orders", orderList);

        User user = users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
        model.addAttribute("user", user);
        return "user-order";
    }
}
