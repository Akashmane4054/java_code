package array;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		// If all digits are 9, we need to create a new array with a carryover.
		int[] result = new int[n + 1];
		result[0] = 1;

		return result;
	}

	public static void main(String[] args) {
		int[] digits = { 3,4,2 }; // Example input: [9, 9, 9]
		int[] result = plusOne(digits);

		System.out.print("Result: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
