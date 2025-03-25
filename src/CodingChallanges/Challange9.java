package CodingChallanges;

public class Challange9 {

	public static void main(String[] args) {

		String[] fruits = { "apple", "bannana", "cherry", "date", "elderberry" };
		for (int i = 0; i < fruits.length; i++) {
			if (i == 2 || i == 4) {
				continue;
			}
			System.out.println(fruits[i] + " ");
		}
	}

}
