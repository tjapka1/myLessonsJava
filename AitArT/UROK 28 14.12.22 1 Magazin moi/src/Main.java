public class Main {
        /*
        вот тут можно было методовнаписать и в майне вызывать
      НО ПОЧЕМУТО ГЕТОРЫ И СЭТОРЫ НЕ ВИДЕТЬ, ХОТЯ Я ИХ ПРОПИСАЛ, НО НЕ A2PRODUCTS
      А НАЗВАНИЯ Я ТАК НАЗВАЛ ПОТОМУ ЧТО МНЕ БЫСТРЕЕ  ОРЕИТИРОВАТЬСЯ, И СОРТИРУЕТЬСЯ ПО ЭРРАХИИ
      ЕЩЁ МОЖНО БЫЛО БЫ MAIN НА A1MAIN НАЗВАТЬ
      А Z1TOOLS  Я ХОТЕЛ СДЕЛАТЬ СКИДКИ МЕТАДАМИ, ЧТОБ ИХ К РАЗЛИЧНЫМ МАССИВАМ ПРИМЕНЯТЬ

       ПЛЮС У МЕНЯ НЕ ВЫШЛО МАИН ОСВОБОДИТЬ, ТИПО ВСЕ МАССИВЫ В A2PRODUCTS ЗАДАТЬ, НО ТАМ НЕ ВИДНО МЕТОДОВ Z1TOOLS
       ТОЖЕ НЕ ПОЙМУ ПОЧЕМУ

      ВЫВОД УЧИТЬСЯ УЧИТЬСЯ И УЧИТЬСЯ

         */

    public static void main(String[] args) {

       A3a3A0ElektroProducts[] mobiles = {
                new A3a3a1Mobiles(3101,"Samsung", "M51", 329, 5, "Snapdrogon", 4, 128, 3),
                new A3a3a1Mobiles(3102,"Ouktikel", "WP19", 329, 2, "Halion", 4, 256, 3)};
        Z1Tools.printArray(mobiles);

        A3a3A0ElektroProducts[] tVs ={
                        new A3a3a2TV(3201,"Pfilips", "FT4565", "FT4565", "rtyhuyhg rfghju hgfdsag fcfgthn", 65 , 669, 5, 5),
                new A3a3a2TV(3202,"Sony", "FT4565", "FT4565", "rtyhuyhg rfghju hgfdsag fcfgthn", 75 , 950, 2, 3),
        };
        Z1Tools.printArray(tVs);
        A2Products[] laptops={
                new A3a3A3Laptop(3301,"Asus", "Rt 758", 999,9,"intel I9", 64, 3000, 5),
                new A3a3A3Laptop(3302,"Asus", "Rt 658", 799,9,"intel I7", 32, 1000, 2),
        };
    Z1Tools.printArray(laptops);

        A2Products[] eatProducts={
                new A3a1A0EatProducts(1002,"Milk",  0.99,9, 8),
                new A3a1A0EatProducts(1001,"Brett",  0.99,5, 3),
        };
Z1Tools.printArray(eatProducts);
        A2Products[] schorts={
                new A3a2A0KleidProducts(2101,  "rew", 29.95,  2, 6,"Adidas","mnbv hlkjh", "s, l, xl", true),
                new A3a2A0KleidProducts(2102,  "reb", 19.95,  3, 6,"Adidas","mnbvzxc hlkjh", "s, l, xl", false),
        };
        Z1Tools.printArray(schorts);
        A2Products[] boots={
                new A3a2A0KleidProducts(2001,  "rew", 59.95,  5, 6,"Adidas","mnbv hlkjh", "42, 44, 46", true),
                new A3a2A0KleidProducts(2002,  "reb", 49.95,  5, 6,"Adidas","mnbvzxc hlkjh", "42, 44, 46", false),
        };
        Z1Tools.printArray(boots);
sales(boots);
    }

    public static void sales(A2Products[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].getPrice();
            System.out.println(arr[i].getPrice());

        }
    }


}