package array;

import java.util.Arrays;

//*Find the largest three distinct elements in an array*


public class largest_three_array_2 {

	void find3Largest(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr);

		int n = arr.length;

		int check = 0, count = 1;

		for (int i = 1; i <= n; i++) {
			if (count < 4) {
				if (check != arr[n - i]) {
					System.out.print(arr[n - i] + " ");
					check = arr[n - i];
					count++;
				}
			} else
				break;
		}
	}

	public static void main(String[] args) {
		largest_three_array_2 obj = new largest_three_array_2();

		int[] arr = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10,100 };

		obj.find3Largest(arr);
	}

}
