package abstraction;

public class Abstraction {

	public static void main(String[] args) {
		// Creating an instance of HarleyDavidson through a reference of type Bike
		Bike obj = new HarleyDavidson();

		// Calling the drive method
		obj.drive();

		// Calling the weight method
		obj.weight();
	}
}
