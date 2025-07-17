package leetCode;

public class ReversePrefixOfString {
//	Input: word = "abcdefd", ch = "d"
//			Output: "dcbaefd"
//			Explanation: The first occurrence of "d" is at index 3. 
//			Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

	public static void main(String[] args) {
		String s = "abcdefd";
		char c = 'd';
		System.out.println(reversePrefix(s, c));

	}

	public static String reversePrefix(String word, char ch) {
		int a = word.indexOf(ch);
		int start = 0;
		StringBuffer sb = new StringBuffer(word);
		while (start < a) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, word.charAt(a));
			sb.setCharAt(a, temp);
			start++;
			a--;
		}
		return sb.toString();

	}

}
