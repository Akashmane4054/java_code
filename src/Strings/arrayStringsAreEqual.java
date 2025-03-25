package Strings;


//1662.Check If Two String Arrays are Equivalent

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.

import java.util.Arrays;

public class arrayStringsAreEqual {
	public static void main(String[] args) {
		String[] array1 = { "apple", "banana", "cherry" };
		String[] array2 = { "applee", "banana", "cherry" };

		boolean areEquivalent = areArraysEquivalent(array1, array2);

		if (areEquivalent) {
			System.out.println("The arrays are equivalent.");
		} else {
			System.out.println("The arrays are not equivalent.");
		}
	}

	public static boolean areArraysEquivalent(String[] arr1, String[] arr2) {
		// Check if both arrays have the same length
		if (arr1.length != arr2.length) {
			return false;
		}

		// Sort the arrays to ensure elements are in the same order
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Check if the sorted arrays are equal
		return Arrays.equals(arr1, arr2);
	}
}
