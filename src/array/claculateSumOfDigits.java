package array;

public class claculateSumOfDigits {

	public static void main(String[] args) {
		int num = 1111;

		int sumOfDigits = calculateSumOfDigits(num);

		System.out.println("Sum of digit of " + num + " is : " + sumOfDigits);
	}

	public static int calculateSumOfDigits(int num) {
		int sum = 0;

		while (num > 0)

		{
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}

}
