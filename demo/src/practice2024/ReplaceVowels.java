package practice2024;

public class ReplaceVowels {
	public static boolean isVowel(char character) {
		return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';

	}

	public static void main(String[] args) {
		String string = "field";
		string.toLowerCase();
		char[] ch = string.toCharArray();
		StringBuffer output = new StringBuffer();

		for (int i = 0; i < ch.length; i++) {
			if (isVowel(ch[i]) == true && isVowel(ch[i + 1]) == false) {
				output.append(ch[i + 1]);
			} else if (isVowel(ch[i]) == true && isVowel(ch[i + 1]) == true) {
				output.append(ch[i + 2]);
			} else {
				output.append(ch[i]);
			}
		}
		System.out.println(output);
	}

}
