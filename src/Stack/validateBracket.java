package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validateBracket {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any bracket : ");
		String s = sc.next();
		//String s = "()[]{}";
		boolean status = validateStringBracket(s);
		System.out.println("Bracket :"+s);
		System.out.println("Status : "+status);

	}

	private static boolean validateStringBracket(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();

				} else {
					return false;
				}
			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();

				} else {
					return false;
				}
			} else {
				stack.push(ch);
			}
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;

	}
}
