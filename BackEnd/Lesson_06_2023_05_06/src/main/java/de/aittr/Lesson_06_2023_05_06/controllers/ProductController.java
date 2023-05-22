package de.aittr.Lesson_06_2023_05_06.controllers;

import de.aittr.Lesson_06_2023_05_06.dao.ProductDAO;
import de.aittr.Lesson_06_2023_05_06.dao.UsersDAO;
import de.aittr.Lesson_06_2023_05_06.entity.Product;
import de.aittr.Lesson_06_2023_05_06.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    private ProductDAO productDAO = new ProductDAO();
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



    @DeleteMapping(value = "/products/{id}")
    public String removeProduct(@PathVariable int id){
        productDAO.remove(id);
        System.out.println("Remove product"+ id);
        return "redirect:/products";
    }

    @GetMapping(value = "/products/new")
    public String createProductForm(Model model){
        Product product=new Product();
        model.addAttribute("product",product);
        return "create-product-form";
    }

    @PostMapping(value = "/products")
    public String addProduct( @ModelAttribute("product")  Product product){
        productDAO.add(product);
        return "redirect:/products";
    }

    @GetMapping(value = "/products/edit/{id}")
    public String editProductForm(@PathVariable  int id, Model model){
        model.addAttribute("product", productDAO.get(id));
        return "edit-product-form";
    }

    @PutMapping(value = "/products/{id}")
    public String editProduct(@ModelAttribute("product") Product product, @PathVariable int id){
        System.out.println("Edit product");
        productDAO.edit(product, id);
        return "redirect:/products";
    }

}
