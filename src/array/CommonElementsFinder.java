package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFinder {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6};

		int[] commonElement = FindCommonElement(arr1, arr2);
		
        System.out.println("Common elements: " + Arrays.toString(commonElement));	
        
	}

	public static int[] FindCommonElement(int[] arr1, int[] arr2) {
		List<Integer> arrayList = new ArrayList<>();

		for (int element : arr1) {
			for (int num : arr2) {
				if (element == num) {
					arrayList.add(element);
					break;
				}

			}
		}
		//Connert list to array
		int[] commonElementArray = new int[arrayList.size()];
		
		for(int i = 0;i<arrayList.size();i++)
		{
			commonElementArray[i] = arrayList.get(i);
		}
		
      return commonElementArray;
	}

}
