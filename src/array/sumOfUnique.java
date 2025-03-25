package array;

import java.util.HashSet;
import java.util.Set;

public class sumOfUnique {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 2, 1 };

		int sumofUnique = calculateSumOfUniqueElement(arr);

		System.out.println("sum of unique element : " + sumofUnique);
	}

	public static int calculateSumOfUniqueElement(int[] arr) {
		Set<Integer> uniqueElement = new HashSet<>();
		int sum = 0;
		for (int element : arr) {
			if (uniqueElement.add(element)) {
				sum = sum + element;
			}
		}
		System.out.println("unique array : "+ uniqueElement);
		return sum;
	}

}
