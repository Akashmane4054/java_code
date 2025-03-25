package array;

public class factorialUsingRecursion {

	public static void main(String[] args) {
		int n = 4;

		int result = factorial(4);

		System.out.println(result);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * factorial(num - 1);

	}
}
