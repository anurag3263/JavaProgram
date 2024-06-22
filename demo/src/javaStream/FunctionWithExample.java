package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionWithExample {

	public static void main(String[] args) {
		//1. filter(): Filters elements based on a predicate.
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		List<String> filteredNames = names.stream()
		                                  .filter(name -> name.length() > 4)
		                                  .collect(Collectors.toList());
		System.out.println(filteredNames);
		// filteredNames: ["Alice", "Charlie"]

		//2. map(): Transforms elements using a function.
		List<Integer> nameLengths = names.stream()
		                                .map(String::length)
		                                .collect(Collectors.toList());
		System.out.println(nameLengths);
		// nameLengths: [5, 3, 7]
		
		//3. forEach(): Performs an action for each element.
		names.stream()
		     .forEach(System.out::println);
		// Output:
		// Alice
		// Bob
		// Charlie
		
		//4. collect(): Reduces elements into a collection or a single value.
		
		String concatenatedNames = names.stream()
		                                .collect(Collectors.joining(", "));
		System.out.println(concatenatedNames);
		// concatenatedNames: "Alice, Bob, Charlie, Dave"
		
		//5. reduce(): Combines elements into a single result.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                 .reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		// sum: 15
		
		//6. sorted(): Sorts elements based on natural order or a comparator.
		
		List<String> sortedNames = names.stream()
		                               .sorted()
		                               .collect(Collectors.toList());
		System.out.println(sortedNames);
		// sortedNames: ["Alice", "Bob", "Charlie"]
		
		//7. findFirst() / findAny(): Returns the first or any element from the stream.
		
		Optional<String> firstElement = names.stream()
		                                    .findFirst();
		System.out.println(firstElement);
		// firstElement: "Alice"
		
		
		//syntax 
//		(parameters) -> expression
//		(parameters) -> { statements; }




	}

}
