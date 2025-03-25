package Strings;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class maximumNoOfStringPairs {
	public int maximumNumberOfStringPairs(String[] words) {
		// Create a HashMap to store the frequency of each string and its reverse
		Map<String, Integer> map = new HashMap<>();

		int count = 0; // Initialize the count of string pairs to 0

		// Iterate through each element (e) in the words array
		for (String e : words) {
			// Reverse the string (e) to get its reverse (s)
			String s = new StringBuilder(e).reverse().toString();

			// Check if the reverse (s) is present in the map and its count is not 0
			if (map.containsKey(s) && map.get(s) != 0) {
				// If a pair is found, decrement the count of s in the map
				map.put(s, map.get(s) - 1);

				// Increment the count of string pairs
				count++;
			} else {
				// If no pair is found, add the original string (e) to the map and increment its
				// count
				int p = map.getOrDefault(e, 0);
				map.put(e, p + 1);
			}
		}

		// Return the final count of string pairs
		return count;
	}
}
