package leetCode;

public class ScoreOfString {
	
//	Input: s = "hello"
//			Output: 13
//			Explanation:
//			The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. 
//			So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

	public static void main(String[] args) {
		String string ="hello";
		System.out.println(scoreOfString(string));

	}
	
	public static int scoreOfString(String s) {
		int output=0;
		for(int i=0;i<s.length()-1;i++) {
			output+=Math.abs((s.charAt(i))- (s.charAt(i+1)));
		}
		
		return output;
		
	}

}
