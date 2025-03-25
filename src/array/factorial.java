package array;

public class factorial {

	public static void main(String[] args) {

		int num = 5;
		
		int result = factorial(num);
		
		System.out.println(result);
	}
	
	public static int factorial (int num)
	{
		if(num == 0)
		{
			return 1;
		}
		return num * factorial(num-1);
	}

}
