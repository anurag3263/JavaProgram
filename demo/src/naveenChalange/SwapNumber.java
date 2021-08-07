package naveenChalange;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("before swapping the number:");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("number after swapping:");
		
		
		  int temp=0; 
		  temp=a; 
		  a=b;
		  b=temp;
		  
		  System.out.println("a= "+a); 
		  System.out.println("b= "+b);
		 
		
		// without temp variable
		
		System.out.println("without temp variable:");
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
