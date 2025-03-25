package Strings;

public class balancedStringSplit {

	public static void main(String[] args) {

		String s = "RLRRRLLRLL";

		int result = countBalanceSubString(s);
		System.out.println(result);
	}

	public static int countBalanceSubString(String s) {
		int count = 0;
		int balance = 0;

		for (int c : s.toCharArray()) {
			if (c == 'L') {
				balance++;
			} else {
				balance--;
			}

			if (balance == 0) {
				count++;
			}
		}

		return count;
	}

}
