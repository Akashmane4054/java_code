package Strings;

import java.util.Stack;

public class RemoveOuterMostParentheses {

	public static void main(String[] args) {
		RemoveOuterMostParentheses removeOuterMostParentheses = new RemoveOuterMostParentheses();

		String s = "(()())(())";

		System.out.println(removeOuterMostParentheses.outerMostParentheses(s));
	}

	public String outerMostParentheses(String s) {

		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (!stack.isEmpty()) {
					result.append(c);
				}
				stack.push(c);
			} else { // c == ')'
				stack.pop();
				if (!stack.isEmpty()) {
					result.append(c);
				}
			}
		}

		return result.toString();
	}
}
