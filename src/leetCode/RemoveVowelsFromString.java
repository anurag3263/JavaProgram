package leetCode;

public class RemoveVowelsFromString {

//	Input : welcome to geeksforgeeks
//	Output : wlcm t gksfrgks
//
//	Input : what is your name ?
//	Output : wht s yr nm ?

	public static void main(String[] args) {
		String string = "welcome to geeksforgeeks";
		String output = "";
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (isVowel(ch[i]) != true) {
				output += ch[i];
			}
		}
		System.out.println("String without Vowel : " + output);
		// or
		System.out.println(string.replaceAll("[aeiouAEIOU]", ""));
	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';

	}

}
