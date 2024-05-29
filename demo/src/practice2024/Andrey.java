package practice2024;

public class Andrey {

	public static void main(String[] args) {
		String string = "30012a";
		System.out.println(isLucky(string));

	}

	public static boolean isLucky(String s) {
		int s1 = 0, e1 = 0;
		if (s.length() != 6) {
			return false;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			try {
				s1 += Integer.parseInt(String.valueOf(s.charAt(i)));
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		for (int j = s.length() / 2; j < s.length(); j++) {
			try {
				e1 += Integer.parseInt(String.valueOf(s.charAt(j)));
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			System.out.println(e1);
		}
		return s1 == e1;
	}

}
