package array;

public class removeDublicate {
	public static void main(String[] args) {
		int[] sortedArray = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };

		int uniqueArray = removeDublicate(sortedArray);

		System.out.println("new Length :" + uniqueArray);
		for (int i = 0; i < uniqueArray; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	public static int removeDublicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int uniqueIndex = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[uniqueIndex]) {
				uniqueIndex++;
				nums[uniqueIndex] = nums[i];
			}
		}
		return uniqueIndex + 1;

	}
}
