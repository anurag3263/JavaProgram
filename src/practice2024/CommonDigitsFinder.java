package practice2024;

import java.util.HashSet;
import java.util.Set;

public class CommonDigitsFinder {

	public static void main(String[] args) {
		int num1 = 36;
		int num2 = 67;

		String strnum1 = String.valueOf(num1);
		String strnum2 = String.valueOf(num2);

		Set<Character> digitSet = new HashSet<>();
		for (Character character : strnum1.toCharArray()) {
			digitSet.add(character);
		}

		boolean foundCommonDigit = false;

		for (Character digit : strnum2.toCharArray()) {
			if (digitSet.contains(digit)) {
				System.out.println("Common digit: " + digit);
				foundCommonDigit = true;
			}
		}
		if (!foundCommonDigit) {
			System.out.println("No common digits found.");
		}
	}

}
