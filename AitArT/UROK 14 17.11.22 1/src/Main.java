public class Main {
    public static void main(String[] args) {

        magic8Ball1();
        String[] company = {"John", "Bob", "Max", "Anna", "Fred", "Sam"};
        String target = "Anna";
        int result = findIndexOfWord(company, target);
        System.out.println(result);
        String word1 = "Nina";
        String word2 = "Nana";
//        System.out.println(word1.equals(word2)); // false
        homeWork1();
        homeWork2();
       int [  ]  digMan= new int[51];
       fillArray(digMan);
       printArray(digMan);
    }


    public static void magic8Ball1() {
        int max = 19;
        int min = 0;
        int x = (int) (min + Math.random() * (max - min + 1));

        String[] answers = {
                "● It is certain (Бесспорно)",
                "● It is decidedly so (Предрешено)",
                "● Without a doubt (Никаких сомнений)",
                "● Yes — definitely (Определённо да)",
                "● You may rely on it (Можешь быть уверен в этом)",

                "● As I see it, yes (Мне кажется — «да»)",
                "● Most likely (Вероятнее всего)",
                "● Outlook good (Хорошие перспективы)",
                "● Signs point to yes (Знаки говорят — «да»)",
                "● Yes (Да)",

                "● Reply hazy, try again (Пока не ясно, попробуй снова)",
                "● Ask again later (Спроси позже)",
                "● Better not tell you now (Лучше не рассказывать)",
                "● Cannot predict now (Сейчас нельзя предсказать)",
                "● Concentrate and ask again (Сконцентрируйся и спроси опять)",

                "● Don’t count on it (Даже не думай)",
                "● My reply is no (Мой ответ — «нет»)",
                "● My sources say no (По моим данным — «нет»)",
                "● Outlook not so good (Перспективы не очень хорошие)",
                "● Very doubtful (Весьма сомнительно)"};

        System.out.println(answers.length);
        String color = "blue";
        if (x >= 5 && x < 10) {
            color = "green";
        }
        if (x >= 10 && x < 15) {
            color = "yellow";
        }
        if (x >= 15) {
            color = "red";
        }

        System.out.println(answers[x] + " " + color);
    }

    public static int findIndexOfWord(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                System.out.println(target);
                return i;
            }
        }
        return -1;
    }

    public static void homeWork1() {
        /*### Задание 1
        Создайте массив из 37 элементов. Заполните его случайными числами (из диапазона от 3 до 19 включительно).
        Выведите массив на печать.*/
        int max = 19;
        int min = 3;
        int x = (int) (min + Math.random() * (max - min + 1));
        String[] elemen = {
                "1 Elm",
                "2 Elm",
                "3 Elm",
                "4 Elm",
                "5 Elm",
                "6 Elm",
                "7 Elm",
                "8 Elm",
                "9 Elm",
                "10 Elm",
                "11 Elm",
                "12 Elm",
                "13 Elm",
                "14 Elm",
                "15 Elm",
                "16 Elm",
                "17 Elm",
                "18 Elm",
                "19 Elm",
                "20 Elm",
                "21 Elm",
                "22 Elm",
                "23 Elm",
                "25 Elm",
                "26 Elm",
                "27 Elm",
                "28 Elm",
                "29 Elm",
                "30 Elm",
                "31 Elm",
                "32 Elm",
                "33 Elm",
                "34 Elm",
                "35 Elm",
                "36 Elm",
                "37 Elm",
        };
        System.out.println(elemen[x]);
    }
    public static void homeWork2() {
/*### Задание 2
        Напишите метод tossCoin(), который бы случайным образом выводил бы в консоль одно из значений: "head", "tail". (
                прим. tossCoin - бросать монетку, head - орел, tail- решка)*/
        int max = 1;
        int min = 0;
        int x = (int) (min + Math.random() * (max - min + 1));
        String[] tassCoin = {"head", "tail"};
        System.out.println(tassCoin[x]);
    }
    public static void fillArray(int[] array) {
/*### Задание 3 (дополнительное)
                Создайте метод, который бы наполнял любой массив произвольной длинны случайными целыми значениями.
                (Метод работает только с массивами чисел)*/
        int max = 19;
        int min = 3;
        for (int i = 0; i < array.length; i++) {
            int x = (int) (min + Math.random() * (max - min + 1));
            array[i] = x;
        }
          }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Zelle in " + i + " Num " + array[i]);
        }
    }
}