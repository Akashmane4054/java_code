package Rough_Practice;

public class peakElement {

	public static void main(String[] args) {
		int[] a = { 5,10,15,5 ,25,2};

		int element = PeakElement(a);
		if (element != 1) {
			System.out.println("Peak Element : " + element);
		} else {
			System.out.println("Peak Element not found");
		}
	}

	public static int PeakElement(int[] a) {
		int n = a.length;
		if(n!=0)
		{
		
		if (n == 1) {
			return a[0];
		}

		if (a[n - 1] > a[n - 2]) {
			return a[n - 1];
		}

		for (int i = 1; i < n - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
               return a[i];
			}
		}
		
		}
		System.out.println("Array not found");

		return -1;
		
	}
	
}
