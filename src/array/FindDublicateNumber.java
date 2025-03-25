package array;

import java.util.HashSet;

public class FindDublicateNumber {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,2,4,5,6};
		
		HashSet<Integer> seen = new HashSet<>();
		System.out.println("Dublicate Number in the Array : ");
		
		for (int num : numbers)
		{
			if(seen.contains(num))
			{
				System.out.println(num+ "");
			}
			else {
				seen.add(num);
			}
		}
	}
}
