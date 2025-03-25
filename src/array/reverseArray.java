package array;

public class reverseArray {

	public static class ReverseArray {

	    // Function to reverse an array
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap elements at start and end indices
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            // Move indices towards the center
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5,6};

	        System.out.println("Original Array:");
	        for (int num : myArray) {
	            System.out.print(num + " ");
	        }

	        // Reverse the array
	        reverseArray(myArray);

	        System.out.println("\nReversed Array:");
	        for (int num : myArray) {
	            System.out.print(num + " ");
	        }
	    }
	 }


}
