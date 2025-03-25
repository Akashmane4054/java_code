package Strings;

public class WordCount {

	public static void main(String[] args) {
		String s = "dog and !man";
		int wordCount = countWords(s);
		System.out.println("Number of valid words in sentences : " +wordCount);

	}

	static int countWords(String s) {
		String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
		String r2 = "[^0-9]+";
		String[] words = s.split("\\s+");
		int count = 0;
		for (String word : words) {
			if (word.matches(regex) && word.matches(r2)) {
				count++;
			}
		}
		return count;
	}

}
