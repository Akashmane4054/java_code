package array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1570 {

	public static int dotProduct(Map<Integer, Integer> vector1, Map<Integer, Integer> vector2) {
		int result = 0;

		// Iterate over the non-zero elements of vector1
		for (Map.Entry<Integer, Integer> entry : vector1.entrySet()) {
			int index = entry.getKey();
			int value1 = entry.getValue();

			// Check if vector2 also has a non-zero element at the same index
			if (vector2.containsKey(index)) {
				int value2 = vector2.get(index);

				// Multiply and add to the result
				result += value1 * value2;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// Example sparse vectors represented as HashMaps
		Map<Integer, Integer> vector1 = new HashMap<>();
		vector1.put(1, 2);
		vector1.put(3, 4);
		vector1.put(5, 6);

		Map<Integer, Integer> vector2 = new HashMap<>();
		vector2.put(1, 3);
		vector2.put(3, 1);
		vector2.put(4, 2);

		// Calculate the dot product
		int result = dotProduct(vector1, vector2);

		// Print the result
		System.out.println("Dot Product: " + result);
	}

}
