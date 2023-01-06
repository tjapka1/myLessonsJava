import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // лекция
        char x = 59;
        char x2 = 'w';
        char x3 = '\n';
        Character x4 = 'w';
        System.out.println(x4.equals(x2)); // только для Character
        System.out.println(x4 == 119); // и для char,  и для Character
        System.out.println(x);
        System.out.println(x3);
        System.out.println(x2);
        // практика
        // создаем String из array чаров
        char[] charArr = {'2', ' ', 'b', 'e', ' ', 'o', 'r', ' ', 'n', 'o', 't', ' ', '2', ' ', 'b', 'e', '?'};
        String phrase = new String(charArr);
        System.out.println(phrase);
        // второй вариант создания
        String phrase2 = String.valueOf(charArr);
        System.out.println(phrase2);
        // сравним эти фразы
        System.out.println(phrase == phrase2); // false - так не будем сравнивать
        System.out.println(phrase.equals(phrase2));
        // разберем String на массив char - метод split()
        String phrase3 = "Hello good people";
        String[] arrayOfStrings = phrase3.split(" "); // разделил на массив строк
        print(arrayOfStrings);
        String phrase4 = "Bob-John-Harry-Ann-Eve";
        String[] arr3 = phrase4.split("-");
        print(arr3);
        // заменить символ // replaceFirst и есть
        String phrase5 = phrase4.replaceAll("-", "*");
        System.out.println(phrase5);
        System.out.println(arr3.length);
        // метод для удаления пробелов с начала и конца - trim
        String phrase6 = " Alisher";
        String phrase7 = "Alisher";
        System.out.println(phrase6.equals(phrase7));
        phrase6 = phrase6.trim(); // убрали пробелы в начале и конце, перезаписали значение в старую переменную
        System.out.println(phrase6);
        System.out.println(phrase6.equals(phrase7));
        // убрать символы из строки
        String phrase8 = phrase4.replaceAll("-", ""); // заменили - на пустые строки
        System.out.println(phrase8);
        // тернарный оператор
        boolean toggle = false;
        String phrase9 = toggle ? "dog" : "cat";  // условие ? значение, если истина : значение, если ложь
        System.out.println(phrase9);
        // как нам вывести char по одному
        String phrase10 = "The dog and the cat are friends";
        for (int i = 0; i < phrase10.length(); i++) {
            System.out.print(phrase10.charAt(i) + " ");
        }
        System.out.println();
        // ниже задание
        String[] wordsArr = {"Hey", "what's up", "key", "car", "keep"};
        // создайте метод типа void, который принимает массив слов
        // и меняет слова, которые начинаются на букву 'k'
        // переводит их в верхний регистр
        print(wordsArr);
        kWordsToUpper(wordsArr);
        print(wordsArr);
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
        String hel = "Я хочу жрать";
        String hel2 = subInUpper(hel, 7, 12);
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
    public static String subInUpper(String text, int start, int finish) {
        // задание
        // напишите метод subInUpper, который принимает строку и два int start,
        // finish и возвращает новую строку
        // которая является фрагментом исходного текса(от start до finish) в upperCase
        // например subInUpper("Hello", 1,3)  вернет нам "EL"
        if (finish > text.length()) {
            finish = text.length() - 1;
        }
        return text.toUpperCase().substring(start, finish);

    }
    public static void kWordsToUpper(String[] array) {
        char x = 'k';
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == x) {
                array[i] = array[i].toUpperCase();
            }

        }

    }
    public static void print(String[] array) {
//        for(int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(Arrays.toString(array)); // создали строку и распечатали
    }
}

