package array;

// Find the peak element of the array

public class findPeek {

	public static void main(String[] args) {
		int arr[] = {5, 10, 23, 24, 12, 67, 10 };
		int n = arr.length;

		System.out.println("Index Of peek point is " + findPeak(arr, n));

	}

	static int findPeak(int arr[], int n) {
		if (n == 1) {
			return 0;
		}

		if (arr[0] >= arr[1]) {
			return 0;
		}

		if (arr[n - 1] >= arr[n - 2]) {
			return n - 1;
		}

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return i;
			}

		}
		return 0;
	}

}
