package abc;

public class A {

	public static void m1() {
	System.out.println("A class from abc package m1() executed");
		
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		System.out.println("A class  from m1 executing");
		A.m1();// accessing class within the class
		m1();
	}

}
