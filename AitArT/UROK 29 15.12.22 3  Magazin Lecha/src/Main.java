public class Main {
    public static void main(String[] args) {

        Assortment assortment = new Assortment();

        Product milk = new Foodstuff(1001, "Milk", 1.79, 7);
        Product bread = new Foodstuff(1002, "Bread", 1.10, 1);
        Product cheese = new Foodstuff(1003, "Cheese", 3.54, 14);
        Product shirt = new Clothes(2001, "Shirt", 14.99);
        Product jeans = new Clothes(2001, "Jeans", 29.99);
        Product pullover = new Clothes(2001, "Pullover", 55);
        Product tv = new Electronics(3001, "TV", 699);
        Product microwave = new Electronics(3002, "Microwave", 115);
        Product smartphone = new Smartphones(3003, "Smartphone", 500);

        assortment.addTypeOfProduct(milk);
        assortment.addTypeOfProduct(bread);
        assortment.addTypeOfProduct(cheese);
        assortment.addTypeOfProduct(shirt);
        assortment.addTypeOfProduct(jeans);
        assortment.addTypeOfProduct(pullover);
        assortment.addTypeOfProduct(tv);
        assortment.addTypeOfProduct(microwave);
        assortment.addTypeOfProduct(smartphone);

        milk.addCount(10);
        bread.addCount(20);
        cheese.addCount(5);
        shirt.addCount(25);
        jeans.addCount(12);
        tv.addCount(2);
        microwave.addCount(3);
        smartphone.addCount(5);

        System.out.println(assortment);

        System.out.println("Sell products\n");
        milk.sellProduct(2);
        smartphone.sellProduct(1);
        cheese.sellProduct(35);
        bread.sellProduct(12);

    }
}