package StringBuilder;

public class Strings {
	
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		
		//insert
		sb.insert(2, 'n');
		System.out.println(sb);
		
		
		//delete
		sb.delete(2, 6);
		System.out.println(sb);
		
		//append
		sb.append("nng");
		System.out.println(sb.length());
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
