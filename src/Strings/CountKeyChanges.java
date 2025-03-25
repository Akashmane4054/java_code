package Strings;

public class CountKeyChanges {

	public static void main(String[] args) {

		String s = "aAbBcb";
		
		int c = countKey(s);
		
		System.out.println(c);
		
	}
	
	public static int countKey(String s) {
		
		String lowerCase = s.toLowerCase();
		
		int n = lowerCase.length();
		
		int count = 0;
		
		for(int i = 0; i<n-1 ; i++)
		{
			if(lowerCase.charAt(i) == lowerCase.charAt(i+1))
			{
				count++;
			}
		}
		
		
		return count;
		
		
	}
	
	

}
