package javaStreamFunction;

import java.util.function.Supplier;

public class SupplierInt {

	public static void main(String[] args) {
		System.out.println(supplier.get());
		System.out.println(supplierText.get());

	}

	private static Supplier<Double> supplier = () -> Math.random();
	private static Supplier<String> supplierText = () -> "Hello World";

}
