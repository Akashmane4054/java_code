package array;

public class sumOfUniqueNumber {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 2, 4, 1 };

		int sumOfUnique = calulateSumOfUniqueNUmber(nums);

		System.out.println("sum of unique : " + sumOfUnique);
	}

	public static int calulateSumOfUniqueNUmber(int[] nums) {
		int[] arr = new int[101];

		int sum = 0;
		for (int num : nums)
			arr[num]++;
		for (int num : nums)
			if (arr[num] == 1)
				sum += num;
		return sum;
	}
}
