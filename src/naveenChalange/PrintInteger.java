package naveenChalange;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args)
	{
		int a=10;
		System.out.println(a);
		
		//taking number from user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer to be print");
		int num=sc.nextInt();
		System.out.println("you enter:  "+num);
		sc.close();

	}

}
