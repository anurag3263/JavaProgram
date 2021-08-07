package naveenChalange_4_5;

public class A {
	 static void eat() {
		System.out.println("A class eat method called");
		
	}
	  void work() {
		System.out.println("A class work method called");
		
	}

	public static void main(String[] args) {
		eat();
		A aobj=new A();
		aobj.work();

	}

}
