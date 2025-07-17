package practice2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Publicis_DebDatta {

	public static void main(String[] args) {
		String string1 = "This is working station";
		String[] s = string1.split("\\s+");
		for (String ele : s) {
			System.out.println(ele);
		}

		String str = "03/02/2024 16:50";
		ArrayList<Integer> numericValues = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			try {
				int value = Character.getNumericValue(str.charAt(i));
				if (value >= 0) {
					numericValues.add(value);
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		Collections.sort(numericValues);
		System.out.println("Numeric values in ascending order:");
		for (int value : numericValues) {
			System.out.print(value + " ");
		}
//	}
//
//	public static ArrayList<Integer> extractNumericValues(String str) {
//		ArrayList<Integer> numericValues = new ArrayList<>();
//		String[] parts = str.split("[^0-9]+");
//		for (String part : parts) {
//			if (!part.isEmpty()) {
//				numericValues.add(Integer.parseInt(part));
//			}
//		}
//		return numericValues;

		List<String> list1 = new ArrayList<>();
		list1.add("john");
		list1.add("johny");
		list1.add("jonson");

		List<String> list2 = new ArrayList<>();
		list2.add("john");
		list2.add("anu");
		list2.add("rag");
		list2.add("johny");

		List<String> commonList = new ArrayList<>();

		for (String ele : list1) {
			if (list2.contains(ele)) {
				commonList.add(ele);

			}
		}
		for (String common : commonList) {
			System.out.println(common);
		}

	}

}
