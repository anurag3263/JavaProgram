package naveenChalange_4_5;

public class B extends A {
	static void eat()
	{
		System.out.println("B class eat method called");
	}
	 void work()
	{
		System.out.println("B class work method called");
	}

	public static void main(String[] args) {
		eat();
		A.eat();
		B.eat();
		A obj=new A();
		obj.work();

	}

}
