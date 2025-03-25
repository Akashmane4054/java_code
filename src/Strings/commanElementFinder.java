package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class commanElementFinder {

	public static int[] findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> commonElements = new ArrayList<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        
        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
                set.remove(num); // Remove to avoid duplicate entries in the result
            }
        }
        
        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2,2,2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        
        int[] common = findCommonElements(arr1, arr2);
        
        System.out.print("Common elements: ");
        for (int num : common) {
            System.out.print(num + " ");
        }
    }
}
