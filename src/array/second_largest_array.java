package array;

import java.util.Arrays;

// *Find Second largest element in an array*

public class second_largest_array {

	static void largest2Array(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr);
	
		int n = arr.length;
		int check =0;
		
		for(int i=2; i<=n;i++)
		{
			check = arr[n-i];
			System.out.println("Second largest element : "+check);
			break;
		}
		

	}

	public static void main(String[] args) {
		int[] arr = { 20, -92, 4, 30, 57, 100,2000 };
		second_largest_array obj = new second_largest_array();
		obj.largest2Array(arr);

	}

}
