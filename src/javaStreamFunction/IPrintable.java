package javaStreamFunction;

@FunctionalInterface
public interface IPrintable {

	// only abstract method is supported with @FunctionalInterface
	public abstract void print();

	// we can add multiple default method
	default void scan() {
		System.out.println("Scanning ....");
	}

	// we can add multiple static method
	static void jumping() {
		System.out.println("Jumping ....");
	}

}
