package practice2024;

public class CharacterAndNumber {

	public static void main(String[] args) {
		String string = "Anurag 83/l1 allahpur allahabad @211006";
		int digit = 0, character = 0, specChar = 0;

		char[] ch = string.toCharArray();

		for (char c : ch) {
			if (Character.isDigit(c)) {
				// System.out.print(c);
				digit++;
			} else if (Character.isLetter(c)) {
				System.out.print(c);
				character++;
			} else {
				specChar++;
			}
		}
		System.out.println();
		System.out.println("Number of digit present: " + digit);
		System.out.println("Number of Char present: " + character);
		System.out.println("Number of SpecChar and space present: " + specChar);

	}

}
