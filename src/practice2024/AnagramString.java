package practice2024;

import java.util.Arrays;

public class AnagramString {

	static boolean checkAnagram(String s1, String s2) {

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (!(s1.length() == s2.length())) {
			return false;
		}

		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		System.out.println(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String str1 = "listen", str2 = "silent";

		if (checkAnagram(str1, str2) == true) {
			System.out.println("Anagram String");
		}else {
			System.out.println("Not an anagram string");
		}
		

	}

}
