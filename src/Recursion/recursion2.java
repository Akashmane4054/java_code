package Recursion;

public class recursion2 {

	public static void main(String args[]) {

		print(1);
	}

	static void print(int n) {
		if(n>5)
		{
			return;
		}
		
		System.out.println(n);
		print(n + 1);
	}

}


//  why recursion ?
//= It helps us in solving bigger and complex problems in simple way.

// =