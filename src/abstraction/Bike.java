package abstraction;

public abstract class Bike {
	// Constructor of the abstract class
	Bike() {
		System.out.println("The Street Bob.");
	}

	// Abstract method to be implemented by subclasses
	abstract void drive();

	// Concrete method with implementation
	void weight() {
		System.out.println("Light on its feet with a hefty : 630 lbs.");
	}
}
