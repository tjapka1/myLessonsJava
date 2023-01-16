import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void lists() {
        List<Product> productList=new ArrayList<>();
        productList.add(new Food("Milka", "Black Shoko", 1.20 , 5));
        productList.add(new Clothes("Boots", "Adidas", "AdRobwoman", 55, 2 , "41"));
        productList.add(new Electro("Mobil","Samsung", "A30", 350.50, 6, "256 GB, 128MP"));
        productList.add(new Clothes("Skirt", "Nike", "RobSk", 15, 5 , "m - Xl"));
        productList.add(new Food("Danone", "ShokoJouhurt", 0.90 , 25));
        productList.add(new Clothes("Skirt", "Adidas", "AdRobSk", 25, 5 , "m - Xl"));
        productList.add(new Clothes("Boots", "Nike", "Robwoman", 45, 2 , "41"));
        productList.add(new Clothes("Boots", "Nike", "Rob", 50, 3 , "46"));
        productList.add(new Food("Milka", "White Shoko", 1.10 , 5));
        productList.add(new Clothes("Shorts", "Nike", "RobSh", 25, 5 , "m - Xl"));
        productList.add(new Food("Danone", "Jouhurt", 0.70 , 20));
        productList.add(new Clothes("Boots", "Adidas", "AdRob", 65, 3 , "46"));
        productList.add(new Electro("Mobil","Ouktitel", "WP19", 450.50, 2, "256 GB"));
        productList.add(new Clothes("Shorts", "Adidas", "AdRobSh", 35, 5 , "m - Xl"));


        SortFunktion.sortList(productList);
    }
}
