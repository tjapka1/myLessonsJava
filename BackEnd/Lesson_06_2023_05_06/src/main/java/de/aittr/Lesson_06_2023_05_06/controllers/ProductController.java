package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.ProductDAO;
import de.aittr.Lesson_06_2023_05_06.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductDAO productDAO = new ProductDAO();
    private List<Product> products = productDAO.getProduct();

    @GetMapping ("/product")
    public String productList (Model model){
        List<Product> res = products;

        model.addAttribute("products", res);
        return "products";
    }
}
