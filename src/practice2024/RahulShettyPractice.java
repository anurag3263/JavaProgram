package practice2024;

import java.util.HashMap;
import java.util.Set;

public class RahulShettyPractice {

	public static void main(String[] args) {
		// 1. reverse the string

		String string = "AnuragTest";

		String outString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			outString += (string.charAt(i));
		}
		System.out.println(outString);

		// 2. Swap two the string
		// a. method
		String s1 = "Anurag";
		String s2 = "chaturvedi";
//		String temp="";
//		
//		temp=s1;
//		s1=s2;
//		s2=temp;
//		
//		System.out.println("Reversed string: "+s1+" ,"+s2);
//		
		// b. method

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("s2: " + s2);
		System.out.println("s1: " + s1);

		// 3. Fibonacci series
		int length = 10;

		int[] num = new int[length];

		num[0] = 0;
		num[1] = 1;
		for (int i = 2; i < length; i++) {
			num[i] = num[i - 1] + num[i - 2];

		}
		System.out.println("Fibonacci Series : ");
		for (int i = 0; i < length; i++) {
			System.out.print(num[i] + ",");
		}
		// 4. Armstrong number 371= 3*3*3+7*7*7+1*1*1

		int number = 371;

		int actualNum = number;
		double result = 0;
		while (actualNum != 0) {
			int n = actualNum % 10;
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;

		}
		System.out.println();
		if (result == number) {
			System.out.println("Given number is Armstrong Number : " + number);
		} else {
			System.out.println("Given number is not an Armstrong Number : " + number);
		}

		System.out.println("=========================");

		// 5. print the sum of digits of a given integer.i/p= 549 ,o/p=18

		int n1 = 549;
		int sum = 0;
		while (n1 != 0) {
			int rem = n1 % 10;
			sum += rem;
			n1 = n1 / 10;
		}
		System.out.println("Sum of all digit : " + sum);

		// 6. check given number is prime number
		int primeNum = 17;
		int count = 0;
		if (primeNum <= 1) {
			System.out.println("enter number greter than zero or 1");
		} else {
			for (int i = 2; i <= primeNum / 2; i++) {
				if (primeNum % i == 0) {
					count++;
				}
			}
			if (count <= 1) {
				System.out.println("Given number is a prime number : " + primeNum);
			} else {
				System.out.println("Given number is not a prime number : " + primeNum);
			}
		}

		// 7 & 8.count the occurrence of characters in a given String

		String occString = "allahabad";
		char[] ch = occString.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character character : ch) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}
		System.out.println(map);

		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			if (map.get(key) > 1) {
				System.out.println(key + " >> " + map.get(key));
			}
		}

		// 9. swap tow number

		int num1 = 18;
		int num2 = 11;

//		int temp1=num1;
//		num1=num2;
//		num2=temp1;

//		System.out.println("number 1:-> "+num1+" 2nd number :-> "+num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("number 1:-> " + num1 + " 2nd number :-> " + num2);

		// 10. reverse an array of elements;

		int[] array = { 1, 2, 4, 8, 7, 6, 5 };
		System.out.println("array before reversing : ");
		for (Integer integer : array) {
			System.out.print(integer + ",");
		}
		System.out.println();
		System.out.println("array after reversing : ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ",");
		}

		// 11. get the count of Capitalized word in a string

		String capString = "Anurag Chaturvedi go";
		int counter = 0;

		for (int i = 0; i < capString.length(); i++) {
			if (capString.charAt(i) >= 'A' && capString.charAt(i) <= 'Z') {
				counter++;
			}
		}
		System.out.println();
		System.out.println("Capital word from given string : " + counter);

		// 12. find the longest consecutive occurrence of integers in a given array.

		int[] arr = { 1, 2, 6, 7, 4, 5, 6, 7, 8, 9, 11, 12 };
		int count1 = 0;
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count1++;
			} else {
				count1 = 0;
			}
			max = Math.max(max, count1 + 1);
		}
		System.out.println("consecutive string  : " + max);

	}

}
