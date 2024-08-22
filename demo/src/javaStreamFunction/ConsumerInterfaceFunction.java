package javaStreamFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceFunction {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Virat", "Rohit", "Dravid", "Jadeja");
		
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println();
		
		Consumer<String> consumer =(s)-> System.out.println(s); // ? String or Superclass of string class
		Consumer<String> consumer1 =(s)->System.out.println(s.toUpperCase());
		Consumer<String> consumer2 =(s)->System.out.println(s.toLowerCase());
		list.forEach(consumer.andThen(consumer1).andThen(consumer2));
	//	list.forEach(consumer1);// or use andThen function
	}

}
