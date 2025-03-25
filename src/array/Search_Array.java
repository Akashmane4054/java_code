package array;

public class Search_Array {

	static int findElement(int[] arr, int n, int key) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 10, 25, 30, 56, 40 };

		int n = arr.length;

		int key = 40;

		int position = findElement(arr, n, key);

		if (position == -1) {
			System.out.println("Array is not found");
		} else {
			System.out.println("Array is found at position :" + position + " And Number is :" + key);
		}

	}

}
