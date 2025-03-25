package Strings;

public class reverseEachWordOfGivenString {

	public static void main(String[] args) {

		String word = "Java is Good Programming language";

		String reverseWord = reverseEachWord(word);

		System.out.println(reverseWord);

	}

	public static String reverseEachWord(String word) {
		String revWord;
		String sentence = "";
		String[] word1 = word.split(" ");

		for (int i = 0; i < word1.length; i++) {
			String nstr = "";

			String word2 = word1[i];

			for (int j = 0; j < word2.length(); j++) {

				char ch;

				ch = word2.charAt(j);
				nstr = ch + nstr;
			}

			sentence = sentence +nstr+ " ";
		}

		return sentence;

	}

}
