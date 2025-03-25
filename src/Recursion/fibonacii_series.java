package Recursion;

import java.util.Scanner;

public class fibonacii_series {

	public static void main(String args[]) {
		int terms, a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		terms = sc.nextInt();

		for (int i = 1; i <= terms; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}
}
