package practice2024;

public class PowerUsingWhile {

	public static void main(String[] args) {
		int number = 5, power = 4;
		long result = 1;
		while (power != 0) {
			result *= number;
			power--;
		}
		System.out.println(result);
	}

}
