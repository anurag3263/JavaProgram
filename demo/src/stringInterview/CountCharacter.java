package stringInterview;

public class CountCharacter {

	public static void main(String[] args) {
		String string = "Anurag";
		char[] ch = string.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
