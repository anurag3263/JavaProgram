package practice2024;

import java.util.HashSet;

public class DuplicatesFromArrayEle {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 1, 2 };

		HashSet<Integer> uniqIntegers = new HashSet<>();
		HashSet<Integer> duplIntegers = new HashSet<>();

		for (Integer num : arr) {
			if (!uniqIntegers.contains(num)) {
				uniqIntegers.add(num);

			} else {
				duplIntegers.add(num);
			}
		}
		System.out.println("Unique Elements from Array : " + uniqIntegers);
		System.out.println("Duplicates Elements from Array : " + duplIntegers);

		
	}

}
