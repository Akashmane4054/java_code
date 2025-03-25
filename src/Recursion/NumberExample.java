package Recursion;

public class NumberExample {
	public static void main(String args[]) {
		// write a function that takes in a number and prints it
		// prints first 5 numbers:1 2 3 4 5

		prints1(1);
	}

	static void prints1(int n) {
		System.out.println(n);
		prints2(2);
	}

	static void prints2(int n) {
		System.out.println(n);
		prints3(3);
	}

	static void prints3(int n) {
		System.out.println(n);
		prints4(4);
	}

	static void prints4(int n) {
		System.out.println(n);
		prints5(5);
	}

	static void prints5(int n) {
		System.out.println(n);
	}

}
