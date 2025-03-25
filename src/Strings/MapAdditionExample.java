package Strings;

import java.util.*;

public class MapAdditionExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Sample data
        String[] keys = {"A", "B", "C", "A", "B"};
        int[] values = {1, 2, 3, 4, 5};

        // Add values to the map
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            int value = values[i];
            if (map.containsKey(key)) {
                // If key already exists, add the value to existing value
                map.put(key, map.get(key) + value);
            } else {
                // If key doesn't exist, add new key-value pair
                map.put(key, value);
            }
        }

        // Print the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
