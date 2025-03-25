package Strings;

import java.util.*;

public class DynamicCategory {

    public static void main(String[] args) {
        // Sample list of objects
        List<Map<String, String>> dtolist = new ArrayList<>();
        dtolist.add(Map.of("point", "7", "category", "fruit"));
        dtolist.add(Map.of("point", "6", "category", "fruit"));
        dtolist.add(Map.of("point", "5", "category", "vegetable"));
        dtolist.add(Map.of("point", "4", "category", "vegetable"));
        dtolist.add(Map.of("point", "3", "category", "fruit"));
        dtolist.add(Map.of("point", "2", "category", "vegetable"));
        dtolist.add(Map.of("point", "6", "category", "vegetable"));
        dtolist.add(Map.of("point", "4", "category", "fruit"));
        dtolist.add(Map.of("point", "3", "category", "vegetable"));
        dtolist.add(Map.of("point", "7", "category", "electronic"));

        // Initialize a map to hold categorized items with unique keys and sum of values
        Map<String, Integer> categoryMap = new HashMap<>();

        // Iterate over each item in the list
        for (Map<String, String> item : dtolist) {
            String category = item.get("category");
            int point = Integer.parseInt(item.get("point"));

            // If the category is not already in the map, add it with value as point
            if (!categoryMap.containsKey(category)) {
                categoryMap.put(category, point);
            } else {
                // If category already exists, add point to existing value
                int currentPoint = categoryMap.get(category);
                categoryMap.put(category, currentPoint + point);
            }
        }

        // Print the categorized items with unique keys and sum of values
        for (Map.Entry<String, Integer> entry : categoryMap.entrySet()) {
            String category = entry.getKey();
            int totalPoints = entry.getValue();

            System.out.println(category.substring(0, 1).toUpperCase() + category.substring(1) + ": " + totalPoints);
        }
    }
}
