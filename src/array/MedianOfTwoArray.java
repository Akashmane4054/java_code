package array;

public class MedianOfTwoArray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergedArray = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0;

		// Merge the two sorted arrays into one
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				mergedArray[k++] = nums1[i++];
			} else {
				mergedArray[k++] = nums2[j++];
			}
		}

		// If there are remaining elements in nums1
		while (i < nums1.length) {
			mergedArray[k++] = nums1[i++];
		}

		// If there are remaining elements in nums2
		while (j < nums2.length) {
			mergedArray[k++] = nums2[j++];
		}

		// Calculate the median based on the merged array
		int n = mergedArray.length;
		if (n % 2 == 0) {
			return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
		} else {
			return mergedArray[n / 2];
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 3 ,2,4};
		int[] nums2 = { 1,5 };
		MedianOfTwoArray solution = new MedianOfTwoArray();
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);
	}
}
