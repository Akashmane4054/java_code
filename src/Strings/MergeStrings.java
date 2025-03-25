package Strings;

public class MergeStrings {

	public static void main(String[] args) {

		String word1 = "abc";
		String word2 = "pqr";

		String word3 = mergeStrings(word1, word2);

		System.out.println(word3);
	}

	public static String mergeStrings(String word1, String word2) {
		StringBuilder merge = new StringBuilder();

		int i = 0;
		int j = 0;

		while (i < word1.length() && j < word2.length()) {

			merge.append(word1.charAt(i++));
			merge.append(word2.charAt(j++));

		}

		while (i < word1.length()) {
			merge.append(word1.charAt(i++));

		}

		while (j < word2.length()) {
			merge.append(word2.charAt(j++));

		}

		return merge.toString();

	}

}
