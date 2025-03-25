package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = " ";

		System.out.println("Enter any value : ");
		 str = sc.next();

		String str2 = " ";

		int l = str.length();

		for (int i = l - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}

		System.out.println(str2);

	}

}
