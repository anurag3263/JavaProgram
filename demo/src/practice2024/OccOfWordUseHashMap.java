package practice2024;

import java.util.HashMap;
import java.util.Map;

public class OccOfWordUseHashMap {

	public static void main(String[] args) {
		String str = "Alice is girl and Bob is boy";

		String[] word = str.split(" ");

		Map<String, Integer> hashMap = new HashMap<>();

		for (String words : word) {

			Integer integer = hashMap.get(words);

			if (integer == null) {
				hashMap.put(words, 1);
			} else {
				hashMap.put(words, integer + 1);
			}
		}
		System.out.println(hashMap);

	}

}
