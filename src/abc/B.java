package abc;

public class B {

	public static void m2() {
		// TODO Auto-generated method stub
		System.out.println("B class from abc package m2() executed");

	}
	public static void main(String[] args) {
		System.out.println("A class from abc package m1() executed outside the class");
		A.m1();// accessing a class outside the class
		
	}

}
