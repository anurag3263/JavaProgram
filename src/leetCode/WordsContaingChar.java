package leetCode;

import java.util.ArrayList;
import java.util.List;

public class WordsContaingChar {

//	Example 1:
//
//		Input: words = ["leet","code"], x = "e"
//		Output: [0,1]
//		Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
//		Example 2:
//
//		Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
//		Output: [0,2]
//		Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
//		Example 3:
//
//		Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
//		Output: []
//		Explanation: "z" does not occur in any of the words. Hence, we return an empty array.

	public static void main(String[] args) {
		String[] w = { "abc", "bcd", "aaaa", "cbc" };
		char target = 'b';
		System.out.println(findWordsContaining(w, target));
	}

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			for (char ch : words[i].toCharArray()) {
				if (ch == x) {
					list.add(i);
					break;
				}
			}
		}
		return list;
	}

}
