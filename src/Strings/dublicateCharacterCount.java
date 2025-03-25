package Strings;

import java.util.HashMap;
import java.util.Map;

public class dublicateCharacterCount {

	public static void main(String[] args) {

		String Char = "Learn Java Programming";

		dublicateCharacterCount(Char);
	}

	static void dublicateCharacterCount(String Char) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : Char.toCharArray()) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

			} else {
				charCountMap.put(ch, 1);

			}
		}

		System.out.println("Duplicate characters in the string:");

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

}
