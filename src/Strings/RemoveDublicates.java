package Strings;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDublicates {
    public static int[] removeDuplicates(int[] arr) {
        // Convert the array to a LinkedHashSet to automatically remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert the LinkedHashSet back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1, 5, 4 };

        System.out.println("Original array: " + Arrays.toString(arr));
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
