package Strings;

public class SortString {

	public static void main(String[] args) {

		String[] strings = { "aanna", "apple", "abange", "graps", "kiwi" };

		// sorting the array using bubble sort
		for (int i = 0; i < strings.length-1; i++) {
			for (int j = 0; j < strings.length - i - 1; j++) {
				if (strings[j].compareTo(strings[j + 1]) > 0) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted Array : ");
		for (String str : strings) {
			System.out.println(str);
		}
	}

}
