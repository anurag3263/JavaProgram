package javaStream;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10, 15, 7,4,9,20,8);
		
		list.stream()
		              .filter(e -> e % 2==0).forEach(System.out::println);
		
	}

}
