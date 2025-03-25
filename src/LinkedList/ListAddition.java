package LinkedList;

public class ListAddition {
	public static void main(String[] args) {
		int[] myList = { 1, 2, 3, 4, 5 };
		int result = addListElements(myList);
		System.out.println("The sum of the list elements is: " + result);
	}

	public static int addListElements(int[] arr) {
		int total = 0;
		for (int element : arr) {
			total += element;
		}
		return total;
	}
}
