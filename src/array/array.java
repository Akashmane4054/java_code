package array;

import java.util.Scanner;

public class array {
	public static void main(String args[]) {
//		int a[] = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Array :");
//
//		for (int i = 0; i < a.length; i++) {
//			int array = sc.nextInt();
//
//			System.out.print("print Array :" + array);
//		}
//
//	}
		
		int[] priceOfPen= new int[5];
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter Array : ");
	    for(int i=0;i<priceOfPen.length;i++)
	        priceOfPen[i]=in.nextInt();

	    for(int i=0;i<priceOfPen.length;i++)
		    System.out.print(priceOfPen[i]);
	}
}
