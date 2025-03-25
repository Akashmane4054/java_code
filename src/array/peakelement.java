package array;

public class peakelement {

    // Function to find a peak element in an array
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        // Check if the array is empty
        if (n == 0) {
            return -1; // No peak element in an empty array
        }

        // Check the first element
        if (nums[0] >= nums[1]) {
            return 0;
        }

        // Check the last element
        if (nums[n - 1] >= nums[n - 2]) {
            return n - 1;
        }

        // Check the middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return i;
            }
        }

        return -1; // No peak element found
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 23, 24, 12, 67, 10};
        int peakIndex = findPeakElement(nums);

        if (peakIndex != -1) {
            System.out.println("Peak element is at index " + peakIndex + ": " + nums[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
