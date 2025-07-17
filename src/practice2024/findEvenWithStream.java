package practice2024;

import java.util.Arrays;
import java.util.List;

public class findEvenWithStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 5, 9, 8, 6);

		list.stream()
		              .filter(e -> e % 2 == 0)
		                 .forEach(System.out::println);
		
	}

}
