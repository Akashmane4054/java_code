package array;

public class RemoveElementFromArray {
    public static int removeElement(int[] nums, int val) {
        int newLength = 0; // Pointer to keep track of the new length of the modified array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }

        return newLength;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3, 4, 5, 3};
        int valueToRemove = 3;
        int newLength = removeElement(array, valueToRemove);

        System.out.println("New Length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
