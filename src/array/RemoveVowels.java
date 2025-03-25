package array;

public class RemoveVowels {
	public static void main(String[] args) {
		String inputString = "Hello, World!";
		String result = removeVowels(inputString);
		System.out.println(result);
	}

	public static String removeVowels(String input) {
		// Using regular expression to remove vowels (case-insensitive)
		return input.replaceAll("[aeiouAEIOU]", "");
	}

}
