package Recursion;

import java.util.Scanner;

public class pprintNo {

	public static void main(String args[]) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		no = sc.nextInt();

		if(no<1)
		{
			System.out.println("no is not allowed");
		}
		for(int i = no;i>0;i--)
		{
			System.out.println(i);
		}
	}

}
