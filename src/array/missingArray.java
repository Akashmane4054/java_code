package array;

public class missingArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2,5, 6, 7 };
		int array = MissingArray(arr);
		System.out.println("Missing Array : " + array);
	}

	public static int MissingArray(int[] arr) {

		int n = arr.length +1;
		int sum = n *(n+1)/2;
		int actualSum = 0;
		
		for(int num : arr)
		{
			actualSum += num;
		}
		
		
		return sum - actualSum;
	}
}
