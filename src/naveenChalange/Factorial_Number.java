package naveenChalange;

public class Factorial_Number {

	public static void main(String[] args) {
		//4!=4*3*2*1 = 24
		
		int num=4;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
         System.out.println("factorial of number is :   "+fact);
	}

}
