package array;

public class MinAndMaxArrayFinder {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 3, 4, 1, 0, 7, 8, 9 };
		int minimum = findMinArray(arr);
		System.out.println("Minimum Array : " + minimum);
		int maximun = findMaxArray(arr);
		System.out.println("Maximum Array : " + maximun);
	}

	public static int findMinArray(int[] arr)

	{
		int n = arr.length;

		int Min = arr[0];
		for (int i = 1; i < n; i++) {

			if (Min > arr[i]) {
				Min = arr[i];
			}
		}

		return Min;
	}

	public static int findMaxArray(int[] arr) {

		int n = arr.length;

		int Max = arr[0];

		for (int i = 1; i < n; i++) {
			if (Max < arr[i]) {
				Max = arr[i];
			}
		}
		return Max;
	}

}
