package naveenChalange;

import java.util.Scanner;

public class Calculator_switchCase {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("plz enter two number: ");
		double first=reader.nextDouble();
		double second=reader.nextDouble();
		
		System.out.println("plz enter an operato:(+, -, *, /)");
		
		char operator=reader.next().charAt(0);
		
		double result=0;
switch(operator) {
		case '+':
			result=first+second;
			break;
			
		case '-':
			result=first-second;
			break;
			
		case '*':
			result=first*second;
			break;
			
		case '/':
			result=first/second;
			break;

         default:
         System.out.println("plz enter correct operator");
         break;
	}
		System.out.println(result);
	}

}
