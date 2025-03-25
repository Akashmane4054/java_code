package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

	public static void main(String[] args) {

		String[] words = { "leet", "code" };
		char x = 'e';

		FindWordsContaining findWordsContaining = new FindWordsContaining();
		List<Integer> num = findWordsContaining.findWords(words, x);
		
		System.out.println(num);

	}

	public List<Integer> findWords(String[] words, char x) {

		List<Integer> numx = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == x) {
					numx.add(i);
					break;
				}

			}
		}

		return numx;

	}

}
