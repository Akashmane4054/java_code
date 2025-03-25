package Recursion;

public class fibonacii_recursion {

	public static void printfib(int a, int b, int terms) {
		if(terms ==0)
		{
			return;
		}
		int c = a + b;
		System.out.println(c);
		printfib(b,c,terms-1);
	}

	public static void main(String args[]) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		int n = 3;
		printfib(a, b, n - 2);
	}

}
