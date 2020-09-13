package com.company;

import java.util.HashMap;
import static com.company.Calculator.scan;

public class Translator {

    static HashMap<String, String> words = new HashMap<>();
    static String playerWord = scan.nextLine();

    /*public static void main(String[] args) {

        words.put("погода", "weather");
        words.put("солнце", "sun");
        words.put("небо", "sky");
        words.put("дождь", "rain");
        words.put("звезды", "stars");

        vocabulary(words, playerWord);
    }*/


    public static void vocabulary(HashMap<String, String> words, String ruWord) {

        for (String map : words.keySet()) {
            if (ruWord.equals(map)) {
                System.out.println("перевод - " + words.get(map));
                    ruWord = scan.nextLine();
                        vocabulary(words, ruWord);
            } else if (ruWord.equals("выход")) {
                System.exit(1);
            } else {
                System.out.println("Такого слова нет!, попробуйте еще раз");
            }
        }
        ruWord = scan.nextLine();
        vocabulary(words, ruWord);
    }
}