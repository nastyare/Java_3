package org.example;

import java.util.HashMap;
import java.util.Map;

public class English {
    public static void main(String[] args) {
        String text = "books and music and movies and music again";

        Map<String, Integer> wordFrequency = countWordFrequency(text);

        wordFrequency.forEach((word, frequency) ->
                System.out.println("Word: '" + word + "', Frequency: " + frequency)
        );
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        String normalizedText = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = normalizedText.split("\\s+");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency;
    }
}
