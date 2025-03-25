package Strings;

import java.util.Arrays;

public class sortString {

	static void sortString(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr));
	}

	public static void main(String[] args) {
		String s = "AkashMane";

		sortString(s);
	}

}
