package de.aittr.Lesson_06_2023_05_06.dao;

import de.aittr.Lesson_06_2023_05_06.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    List <Product> list;

    public ProductDAO(){
        list = new ArrayList<>(
                List.of(
                        new Product("Milk", 0.50, "hgr"),
                        new Product("Bread", 0.30, "asdf"),
                        new Product("Ei" , 0.10, "zxcvb")
                )
        );
    }

    public List<Product> getProducts(){return list;}
    public Product get(int id){
        return list.stream().filter(product -> product.getId()==id).findAny().get();
    }
    public void remove(int id){
        list.removeIf(product -> product.getId() == id);
    }
    public void add(Product product){list.add(product);}
    public void edit(Product product, int id){
        int index = list.indexOf(get(id));
        list.set(index, product);
    }
}
