package practice2024;

import java.util.ArrayList;
import java.util.Collections;

public class NumericSorter {
	public static void main(String[] args) {
		String str = "03/02/2024 16:50";
		ArrayList<Integer> numericValues = extractNumericValues(str);
		Collections.sort(numericValues);
		System.out.println("Numeric values in ascending order:");
		for (int value : numericValues) {
			System.out.print(value + " ");
		}
	}

	public static ArrayList<Integer> extractNumericValues(String str) {
		ArrayList<Integer> numericValues = new ArrayList<>();
		String[] parts = str.split("[^0-9]+");
		for (String part : parts) {
			if (!part.isEmpty()) {
				numericValues.add(Integer.parseInt(part));
			}
		}
		return numericValues;
	}
}
