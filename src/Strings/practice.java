package Strings;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any word : ");

		String word = sc.next();

		String reverseWord = "";

		char ch;

		for (int i = 0; i < word.length(); i++)

		{
			ch = word.charAt(i);

			reverseWord = ch + reverseWord;

		}
		System.out.println(reverseWord);
	}

}
