package practice2024;

public class LuckyNumberChecker {
	public static void main(String[] args) {
		String number1 = "567125";
		String number2 = "300111";

		System.out.println(isLucky(number1)); // Output: false
		System.out.println(isLucky(number2)); // Output: true
	}

	public static boolean isLucky(String number) {
		if (number.length() != 6) {
			throw new IllegalArgumentException("The input number must be a 6-digit number.");
		}

		int sumFirst3Digits = 0;
		int sumLast3Digits = 0;

		for (int i = 0; i < number.length(); i++) {
			int digit = Character.getNumericValue(number.charAt(i));
			if (i < 3) {
				sumFirst3Digits += digit;
			} else {
				sumLast3Digits += digit;
			}
		}

		return sumFirst3Digits == sumLast3Digits;
	}
}