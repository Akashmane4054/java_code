package array;

public class SortArray {

	public static void main(String[] args) {

		int[] array = { 3, 4, 5, 2, 1 };

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;

				}
			}

		}
		
		

		System.out.println("sorted Array : ");

		for(int num : array)
		{
			System.out.println(num + " ");
		}
	}

}
