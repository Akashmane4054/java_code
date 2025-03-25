package array;

public class Missing_No_Of_Array {
	
	public static void main(String[] args) {
       int[] arr = {1,2,3};
       int expected_no_elements = arr.length+1;
       int total_sum = expected_no_elements*(expected_no_elements+1)/2;
       //System.out.println(total_sum);
       
       int sum = 0;
       for(int i=0; i<arr.length;i++)
       {
    	   sum = sum+arr[i];
       }
       System.out.println("missing no of array is:"+(total_sum - sum));
	}

}
