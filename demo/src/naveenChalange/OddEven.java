package naveenChalange;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("plz enter a number:");
		
		int num = scr.nextInt();
		if(num%2==0)
		{
			System.out.println(num+ " number is even");
		}
		else
		{
			System.out.println(num+ " number is odd");
		}
		scr.close();

	}

}
