package practice2024;

import java.util.HashMap;
import java.util.Map;

public class OccOfCharUseMap {

	public static void main(String[] args) {
		String string = "Allahabad";
		string=string.toLowerCase();

		char[] ch = string.toCharArray();

		Map<Character, Integer> hasMap = new HashMap<>();

//		for (Character character : ch) {
//			Integer integer = hasMap.get(character);
//			if (integer == null) {
//				hasMap.put(character, 1);
//			} else {
//				hasMap.put(character, integer + 1);
//			}
//		}
//		System.out.println(hasMap);
		
		for(Character character : ch) {
			if(hasMap.containsKey(character)) {
				hasMap.put(character, hasMap.get(character)+1);
			}else {
				hasMap.put(character, 1);
			}
		}
		for(Map.Entry entry: hasMap.entrySet()) {
			System.out.println(entry.getKey()+ ": "+entry.getValue());
		}
	}

}
