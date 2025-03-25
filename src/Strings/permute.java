package Strings;

public class permute {

	public static void main(String[] args) {

		String Str = "abc";
		System.out.println("All permutations of the string \"" + Str + "\":");
		permute(Str, "");

	}

	public static void permute(String Str, String prefix) {
		if (Str.length() == 0) {
			System.out.println(prefix);
			return;
		} else {
			for (int i = 0; i < Str.length(); i++) {
				String rem = Str.substring(0, i) + Str.substring(i + 1);
				permute(rem, prefix + Str.charAt(i));
			}
		}
	}

}
