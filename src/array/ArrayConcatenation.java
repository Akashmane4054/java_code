package array;

import java.util.ArrayList;

public class ArrayConcatenation {
	public static void main(String []args){
         int [] array1 = {1,2,3};
         int[] array2 = {4,5,6};
         
         ArrayList<Integer> list = concateArrayList(array1,array2);
         
         System.out.println("Concate arrayList : " + list);
	}
	public static ArrayList<Integer> concateArrayList(int[] array1, int[] array2) {
		ArrayList<Integer> List = new ArrayList<>();
		for (int num : array1) {
			List.add(num);
		}

		for (int num1 : array2) {
			List.add(num1);
		}
		return List;
	}
}
