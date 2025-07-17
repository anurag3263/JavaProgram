package practice2024;

public class RevStringWithTwoPointer {

	public static void main(String[] args) {

		String string = "Anurag";

		char[] ch = string.toCharArray();

		int start = 0;
		int end = ch.length - 1;

		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start += 1;
			end -= 1;

		}
		for (char cha : ch) {
			System.out.print(cha);
		}

	}

}
