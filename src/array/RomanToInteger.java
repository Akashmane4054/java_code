package array;

import java.util.HashMap;

public class RomanToInteger {

	public static int romanToInt(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		// Create a hashmap to store the mapping of Roman characters to integers
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = romanMap.get(s.charAt(s.length() - 1)); // Initialize with the last character

		for (int i = s.length() - 2; i >= 0; i--) {
			// If the value of the current character is less than the value of the next
			// character,
			// subtract the current value; otherwise, add the current value
			if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
				result -= romanMap.get(s.charAt(i));
			} else {
				result += romanMap.get(s.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String romanNumeral = "IX";
		int result = romanToInt(romanNumeral);
		System.out.println("The integer representation of " + romanNumeral + " is: " + result);
	}
}
