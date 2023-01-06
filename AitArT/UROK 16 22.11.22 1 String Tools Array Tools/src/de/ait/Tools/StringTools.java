package de.ait.Tools;

import java.util.Arrays;

public class StringTools {
    public static String uperWord(String text) {
        return text.toUpperCase();
    }
    public static String lowerWord(String text) {
        return text.toLowerCase();
    }
    public static String cypher(String text) {
            return text.trim().replaceAll("d", "xxxxxxx").replaceAll("c", "s");
    }
    public static String subInUpper(String text, int start, int finish) {
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
        System.out.println(Arrays.toString(array)); // создали строку и распечатали
    }
}
