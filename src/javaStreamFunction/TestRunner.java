package javaStreamFunction;

public class TestRunner {

	public static void main(String[] args) {

		// Conventional Way
		IPrintable obj1 = new ConsolePrinterImp();
		obj1.print();

		// Anonymous inner class Way
		IPrintable obj2 = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From Ananymous Inner Class");

			}
		};
		obj2.print();

		// Functional Programming Using Java Stream Lambda

		// If multiple line of statements is there after -> then use {} other wise
		// directly use like
		// () -> System.out.println("Functional Programming With Lambda ");
		// NOTE : interface with only one abstract method is supported by lambda
		// And it can have multiple Default and static method

		IPrintable lambda = () -> {
			System.out.println("Functional Programming With Lambda ");
		};
		lambda.print();
		lambda.scan();
		
		
		// Implementation of Interface with generic type
		
		IPrintableGeneric<String> objGen1 =a -> System.out.println(a.toLowerCase());
		objGen1.print("ANURAG");
		
		IPrintableGeneric<Integer> objGen2 =a -> System.out.println(a+4);
		objGen2.print(9);
		
		
		IMyGeneric<String, String, String> objMy1 = (a,b)->a+" "+b;
		System.out.println(objMy1.print("viru", "ska"));
	}

}
