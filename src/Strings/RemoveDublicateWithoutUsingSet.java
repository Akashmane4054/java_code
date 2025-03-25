package Strings;

import java.util.Arrays;

public class RemoveDublicateWithoutUsingSet {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 6, 3, 5 };
		int[] uniqueArr = removeDublicates(arr);

		System.out.println("Original Array :" + Arrays.toString(arr));
		System.out.println("Array with Dublicate Removed :" + Arrays.toString(uniqueArr));
	}

	public static int[] removeDublicates(int[] arr) {
		int[] uniqueArray = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDublicate = false;
			for (int j = 0; j < count; j++) {

				if (arr[i] == uniqueArray[j]) {
					isDublicate = true;
					break;
				}
			}

			if (!isDublicate) {
				uniqueArray[count++] = arr[i];
			}
		}
		return Arrays.copyOf(uniqueArray, count);
	}

}
