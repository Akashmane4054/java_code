package array;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // When the loop ends, 'left' will be the insertion position
        return left;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 6};
        int target = 5;
        int insertPosition = searchInsert(sortedArray, target);

        System.out.println("Insert Position: " + insertPosition);
    }
}
