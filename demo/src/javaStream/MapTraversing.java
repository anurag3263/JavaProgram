package javaStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTraversing {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("Sachin", 9.6);
		map.put("Virat", 9.4);
		map.put("Dravid", 8.6);

		map.entrySet().stream().filter(e -> e.getValue() >= 9.1)
				.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
		
		
		
		int[] arr = { 1, 2, 4, 5, 6, 8, 9 };

		Arrays.stream(arr).filter(e -> e % 2 != 0).forEach(System.out::println);

		String str = "apple is good fruit";

		// Example 1: Split string by space and print each word
		Arrays.stream(str.split("\\s+")).forEach(System.out::println);

		// Example 2: Filter and print words containing 'o'
		Arrays.stream(str.split("\\s+")).filter(word -> word.contains("o")).forEach(System.out::println);

		// Example 3: Map each word to its length and print
		Arrays.stream(str.split("\\s+")).map(String::length).forEach(System.out::println);

		// Example 4: Convert to lowercase and collect to a list
		List<String> resultList = Arrays.stream(str.split("\\s+")).map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(resultList);

		String reverseString = Arrays.stream(str.split("\\s+")).reduce("",(s1, s2) -> s2 +" "+ s1);
		System.out.println("Original String --> " + str);
		System.out.println("Reverse String --> " + reverseString);
		
		String reverse = Arrays.stream(str.split("\\s+"))
				.map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println("Original String --> " + str);
		System.out.println("Reverse String --> " + reverse);
	}

}
