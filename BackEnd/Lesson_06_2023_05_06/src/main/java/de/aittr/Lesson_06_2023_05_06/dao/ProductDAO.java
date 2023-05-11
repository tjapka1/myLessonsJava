package de.aittr.Lesson_06_2023_05_06.dao;

import de.aittr.Lesson_06_2023_05_06.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public List<Product> getProduct(){
        List<Product> products = new ArrayList<>(
                List.of(new Product("Milk", 1.00,10),
                        new Product("Bread",2.50, 10),
                        new Product("Egs",1.90, 10))
        );


        return products;
    }
}
