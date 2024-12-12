package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapKeySwap {
    public static void main(String[] args) {
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Flame");
        originalMap.put(2, "Sparkle");
        originalMap.put(3, "Fire");

        Map<String, Integer> swappedMap = swapKeysAndValues(originalMap);

        swappedMap.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );
    }

    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> inputMap) {
        Map<V, K> swappedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        return swappedMap;
    }
}
