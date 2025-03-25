package array;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		
		
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();

		int next;
		
		

	
		System.out.println("Before swap number : "+firstNumber + " " + secondNumber );
				
		next = firstNumber;
		firstNumber = secondNumber;
		
		secondNumber= next;
		
		System.out.println("After swap number : "+firstNumber + " " + secondNumber );
		
		
		
		
		
		
	}

}
