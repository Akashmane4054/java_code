package Strings;

import java.util.Arrays;

public class MinMSeatoveTo {

	
	public static void main(String[] args) {

		int[] seats  = {3,1,5};
		
		int[] student = {2,7,4};
		
		
		int ans = minMovesToSeat(seats , student);
		System.out.println(ans);
	}

	
	public static int minMovesToSeat(int[] seats, int[] students) {
		Arrays.sort(seats);
		Arrays.sort(students);
		int ans = 0;
		for (int i = 0; i < seats.length; i++)
			ans += Math.abs(seats[i] - students[i]);
		return ans;
	}
}