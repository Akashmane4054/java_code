package Strings;

import java.util.Scanner;

public class numberToWordsConverter {

	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	private static final String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };
	private static final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninety" };

	public static String convertToWords(int number) {
		if (number == 0) {
			return "Zero";
		}
		if (number < 0) {
			return "Minus " + convertToWords(-number);
		}
		if (number < 10) {
			return units[number];
		}
		if (number < 20) {
			return teens[number - 10];
		}
		if (number < 100) {
			return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
		}
		if (number < 1000) {
			return units[number / 100] + " Hundred"
					+ ((number % 100 != 0) ? " and " + convertToWords(number % 100) : "");
		}
		if (number < 1000000) {
			return convertToWords(number / 1000) + " Thousand"
					+ ((number % 1000 != 0) ? " " + convertToWords(number % 1000) : "");
		}
		if (number < 1000000000) {
			return convertToWords(number / 1000000) + " Million"
					+ ((number % 1000000 != 0) ? " " + convertToWords(number % 1000000) : "");
		}
		return convertToWords(number / 1000000000) + " Billion"
				+ ((number % 1000000000 != 0) ? " " + convertToWords(number % 1000000000) : "");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		String words = convertToWords(number);
		System.out.println("Number in words: " + words);
	}

}
