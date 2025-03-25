package Strings;

public class MaxOccurrenceCharacter {

	public static void main(String[] args) {
		String str = "aaaaabbbbbbcccc";

		char maxChar = getMaxOccurrenceChar(str);

		System.out.println("Character with maximum occurrences: " + maxChar);
	}

	public static char getMaxOccurrenceChar(String str)

	{
		int[] charCount = new int[256];
		for (char ch : str.toCharArray()) {
			charCount[ch]++;
		}

		int maxCount = 0;
		char maxChar = ' ';

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				maxChar = (char) i;
			}
		}

		return maxChar;
	}

}
