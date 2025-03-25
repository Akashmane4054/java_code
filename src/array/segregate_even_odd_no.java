/**
 * 
 */
package array;

/**
 * Segregate even and odd numbers 
 *
 */
public class segregate_even_odd_no {
	static void arrayEvenAndOdd(int arr[], int n) {
		int[] a = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
		int n = arr.length;

		arrayEvenAndOdd(arr, n);

	}

}
