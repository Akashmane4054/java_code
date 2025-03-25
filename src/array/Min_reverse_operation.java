package array;

import java.util.Arrays;

//2612. Minimum Reverse Operations

public class Min_reverse_operation {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 2, 4, 6 };
		System.out.println(minOperations(nums));
	}

	public static int minOperations(int[] nums) {
		int[] sorted = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sorted);

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != sorted[i]) {
				count++;
			}
		}
		return count / 2;
	}

}
