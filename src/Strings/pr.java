package Strings;

public class pr {

	public static void main(String[] args) {

		String s = "AaSHsddgha";

		int count = countCheck(s);

		System.out.println(count);
	}

	public static int countCheck(String s) {
		String word = s.toLowerCase();

		int count = 0;

		for (int i = 0; i < word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i + 1))

			{
				count++;
			}
		}

		return count;
	}
}
