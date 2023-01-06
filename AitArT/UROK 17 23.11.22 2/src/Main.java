public class Main {
    public static void main(String[] args) {

        String word1 = "Bob";
        String word2 = lowerWord(word1);
        System.out.println(word2);
        String car = " carrot";
        System.out.println(car);
        String car2 = cypher(car);
        System.out.println(car2);

        // метод substring() нужен, чтобы взять какой-нибудь кусочек строки
        String word6 = "Long and boring phrase with many chars in it";
        String word7 = word6.substring(5); // вырезать с какого-то индекса и до конца
        System.out.println(word7);
        // от индекса до индекса (второй не включительно) // последнее +1
        String word8 = word6.substring(5, 15);
        System.out.println(word8);
        String hel="Hello";
        String hel2=subInUpper(hel, 1, 3);
        System.out.println(hel2);



    }
    public static String uperWord(String text) {
        return text.toUpperCase();
    }
    public static String lowerWord(String text) {
        return text.toLowerCase();
    }
    public static String cypher(String text) {
        // задание
        // напишите метод cypher, который принимает String - возвращает новый String
        // Он убирает пробелы в начале и конце строки
        // Он меняет все буквы 'r' на буквы 'l'
        // Он меняет все буквы 'c' на буквы 's'
        // и возвращает то, что получилось
        // если передадим в него строку "   carrot   " - он вернет нам "sallot"
//        String text1 = text.trim();
//        String text2 = text1.replaceAll("r", "l");
//        String text3 = text2.replaceAll("c", "s");
        return text.trim().replaceAll("r", "l").replaceAll("c", "s");
    }
    public static String subInUpper(String text, int start, int finish){
        // задание
        // напишите метод subInUpper, который принимает строку и два int start,
        // finish и возвращает новую строку
        // которая является фрагментом исходного текса(от start до finish) в upperCase
        // например subInUpper("Hello", 1,3)  вернет нам "EL"
        if (finish>text.length()){
            finish=text.length()-1;}
        return text.toUpperCase().substring(start, finish);

    }
}