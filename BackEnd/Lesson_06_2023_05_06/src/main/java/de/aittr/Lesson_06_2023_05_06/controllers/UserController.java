package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.UsersDAO;
import de.aittr.Lesson_06_2023_05_06.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private UsersDAO usersDAO=new UsersDAO();
    private List<User> users = usersDAO.getUsers();
    @GetMapping(value = "/users")
    public String userList(@RequestParam(name = "city", required = false, defaultValue = "all") String city, Model model){
        List <User> res =users;
        if (!city.equals("all")){
            res=users.stream().filter(c->c.getCity().equals(city)).toList();
        }


        model.addAttribute("users", res);
        return "users";
}
    @GetMapping(value = "/users/{id}")
    public String  userById(Model model, @PathVariable int id){
        List <User> res =new ArrayList<>();

        for (User user : users) {
            if (user.getId() == id)
                res.add(user);
        }
        model.addAttribute("users", res);
        model.addAttribute("user_id", id);
        return "user-info";
    }

}
