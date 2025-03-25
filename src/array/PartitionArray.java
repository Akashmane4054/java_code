package array;

//1013. Partition Array Into Three Parts With Equal Sum

public class PartitionArray {

	public static void main(String[] args) {
		PartitionArray partitionArray = new PartitionArray();
		int[] arr = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1,2,3 };

		System.out.println(partitionArray.canThreePartsEqualSum(arr));

	}

	public boolean canThreePartsEqualSum(int[] arr) {
		int totalSum = 0;
		for (int num : arr) {
			totalSum += num;
		}

		if (totalSum % 3 != 0) {
			return false;
		}

		int targetSum = totalSum / 3;
		int currentSum = 0;
		int parts = 0;

		for (int num : arr) {
			currentSum += num;

			if (currentSum == targetSum) {
				parts++;
				currentSum = 0;
			}

		}

		return parts >= 3;

	}

}
