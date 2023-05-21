package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.ProductDAO;
import de.aittr.Lesson_06_2023_05_06.dao.UsersDAO;
import de.aittr.Lesson_06_2023_05_06.entity.Product;
import de.aittr.Lesson_06_2023_05_06.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    private ProductDAO productDAO =new ProductDAO();
    private List<Product> products = productDAO.getProducts();

    @GetMapping(value = "/products")
    public String productList(Model model){
        List<Product>res=products;
        model.addAttribute("product", res);
        return "products";
    }
    @GetMapping(value = "/products/{id}")
    public String productList(@PathVariable int id, Model model){
        Product res=productDAO.get(id);
        model.addAttribute("product", res);
        model.addAttribute("product_id", id);
        return "products";
    }



    @DeleteMapping(value = "/users/{id}")
    public String removeUser(@PathVariable int id){
        usersDAO.remove(id);
        System.out.println("Remove user"+ id);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/new")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create-user-form";
    }

    @PostMapping(value = "/users")
    public String addUser( @ModelAttribute("user")  User user){
        usersDAO.add(user);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/edit/{id}")
    public String editUserForm(@PathVariable  int id, Model model){

        model.addAttribute("user", usersDAO.get(id));
        return "edit-user-form";
    }

    @PutMapping(value = "/users/{id}")
    public String editUser(@ModelAttribute("user") User user, @PathVariable int id){
        System.out.println("Edit user");
        usersDAO.edit(user,id);
        return "redirect:/users";
    }

}
