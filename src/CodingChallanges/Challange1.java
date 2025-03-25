package CodingChallanges;

public class Challange1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		System.out.println(findValues(numbers));

	}

	public static int findValues(int[] arr)
	{
		return arr[arr.length - arr[2]];
	}
}
