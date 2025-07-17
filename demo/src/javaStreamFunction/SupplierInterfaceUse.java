package javaStreamFunction;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierInterfaceUse {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the String you want to covert to Lower and Upper Case :");
//		String input = scanner.nextLine();
//		
//		System.out.println("Lower Case : "+input.toString().toLowerCase());
//		System.out.println("Upper Case : "+input.toString().toUpperCase());
//		scanner.close();
		covertString();

	}
	/**
	 * Supplier Interface Use
	 */
	
	public static void covertString() {
		Scanner scanner = new Scanner(System.in);
		Supplier<String> supplier = () -> {
			System.out.println("Enter the String you want to covert to Lower and Upper Case :");
			String input =scanner.nextLine();
			System.out.println("Lower Case : "+input.toString().toLowerCase());
			System.out.println("Upper Case : "+input.toString().toUpperCase());
			return input;
		};
		supplier.get();
		scanner.close();
		
	}
	 

}
