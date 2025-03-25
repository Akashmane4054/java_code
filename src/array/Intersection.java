package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		int[] arr1 = { 7, 3, 9, 9, 3 };
		int[] arr2 = { 6, 3, 9, 2, 9, 4 };

		Set<Integer> set = new HashSet<>();
		for (int num : arr1) {
			set.add(num);

		}

		Set<Integer> intersection = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			if (set.contains(arr2[i])) {
				intersection.add(arr2[i]);
			}
		}

		int[] result = new int[intersection.size()];

		int i = 0;
		for (int num : intersection) {
			result[i++] = num;
		}

		System.out.println("Intersection of arr1 and arr2: " + Arrays.toString(result));

	}

}
