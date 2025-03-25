package array;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {

	public static void main(String[] args) {

		int[] arr1 = { 7, 3, 9};
		int[] arr2 = { 6, 3, 9, 2, 9, 4 };

		Integer[] UnioArrayList = mergeUnionArray(arr1, arr2);

		for (int num : UnioArrayList) {
			System.out.println(num + " ");
		}
	}

	public static Integer[] mergeUnionArray(int[] arr1, int[] arr2) {

		Set<Integer> set = new HashSet<>();
		
		for(int num : arr1)
		{
			set.add(num);
		}
		
		for(int num : arr2)
		{
			set.add(num);
		}
		
		Integer[] unionArray = set.toArray(new Integer[0]);

		return unionArray;

	}

}
