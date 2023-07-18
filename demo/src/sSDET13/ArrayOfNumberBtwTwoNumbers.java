package sSDET13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOfNumberBtwTwoNumbers {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(between(1, 4)));

	}
	
	public static int[] between(int a,int b) {
		
		return IntStream.rangeClosed(a, b).toArray();
		
	}

}
