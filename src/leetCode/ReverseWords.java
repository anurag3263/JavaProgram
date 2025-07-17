package leetCode;

public class ReverseWords {

	/**
	 * Example 1:
	 * 
	 * Input: s = "the sky is blue" Output: "blue is sky the" Example 2:
	 * 
	 * Input: s = " hello world " Output: "world hello" Explanation: Your reversed
	 * string should not contain leading or trailing spaces. Example 3:
	 * 
	 * Input: s = "a good example" Output: "example good a" Explanation: You need to
	 * reduce multiple spaces between two words to a single space in the reversed
	 * string.
	 */

	public static void main(String[] args) {
		// String s = "the sky is blue";
		// String s = " hello world ";
		String s = "a good   example";
		// String wordString = reverseWords(s);
		// System.out.println(wordString);
		System.out.println(twoPointerString(s));

	}

	public static String reverseWords(String s) {
		// To split a string by space, use \\s+ .
		// It will split the string by single or multiple whitespace characters such as
		// space, tab, etc.
		String[] word = s.trim().split("\\s+");
		String reverse = "";
		for (int i = word.length - 1; i >= 0; i--) {
			reverse += word[i] + " ";
		}
		return reverse;
	}

	public static String twoPointerString(String s) {
		String[] word = s.trim().split("\\s+");
		int i = 0, j = word.length - 1;
		while (i < j) {
			String temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return String.join(" ", word);
	}

}
