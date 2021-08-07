package constructorChaining;

import java.util.Scanner;

public class PrintOddNumber {

	public static void main(String[] args) {
		//int n=7;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number  ");

		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("number  " +n+ "  is an even number");
		}
		else
		{
			System.out.println("number  " +n+ "  is an odd number");
		}

	}

}
