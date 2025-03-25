package array;

//*Find the largest three distinct elements in an array*

public class largest_three_array {

	static void print3ArrayElement(int arr[], int n) {
		int i, first, second, third;

		if (n < 3) {
			System.out.println("Invalid Input please Enter atLeast 3 Element");
			return;
		}

		third = first = second = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {

			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			}

			else if (arr[i] > third) {
				third = arr[i];
			}

		}
		System.out.println("Three largest element are :" + first + " " + second + " " + third);

	}

	public static void main(String[] args) {
		int[] arr = { 20, 13,20,21,25,34};
		int n = arr.length;

		print3ArrayElement(arr, n);
	}

}
