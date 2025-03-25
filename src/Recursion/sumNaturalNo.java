package Recursion;

import java.util.Scanner;

public class sumNaturalNo {
	public static void main(String args[]) {
		int no, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("natural number :");
		no = sc.nextInt();
		int sum = 0;
		for (i = 0; i < no; i++) {
			System.out.println(i);
			sum = sum + i;
			System.out.println(sum);
		}
		
	}
}
