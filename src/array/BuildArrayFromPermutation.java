package array;

public class BuildArrayFromPermutation {

	public static void main(String[]args)
	{
		int[] nums = {0, 2, 1, 5, 3, 4};
		int[] result = buildArray(nums);
		
		System.out.println("Original Array : ");
		printArray(nums);
		
		System.out.println("Build Array : ");
		printArray(result);
	}
	
	public static int[] buildArray(int[] nums)
	{
	   int n = nums.length;
	   int[] result = new int[n];
	   for(int i = 0;i<n; i++)
	   {
		   result[i] = nums[nums[i]];
	   }
		
		return result;
	}
	
	public static void printArray(int[] arr)
	{
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
