package practice2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LinkedInOractice {

	public static void main(String[] args) {
		// generate Random numbers.

		double string = Math.random();
		System.out.println("Random doubles: " + string);

		Random random = new Random();
		int numRand = random.nextInt(10000);
		char ch = (char) (random.nextInt(26) + 'a');
		System.out.println(ch);
		System.out.println("Random Integers: " + numRand);
		int max = 100, min = 50;
		System.out.println("Random Integers 2: " + random.nextInt(min));
		System.out.println("Generated numbers are within " + min + " to " + max);
		System.out.println(random.nextInt(max - min + 1) + min);
		System.out.println(random.nextInt(max - min + 1) + min);
		System.out.println(random.nextInt(max - min + 1) + min);

		System.out.println("======================");

		// Why is 28 a perfect number?
		// The number 28 is a perfect number because its proper divisors sum up to give
		// 28,

		int number = 28;
		int divisor = 0;

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				divisor += i;
				System.out.print(i + ",");
			}
		}
		if (number == divisor) {
			System.out.println("Given number is perfect number : " + number);
		}
		System.out.println("Divisor sum : " + divisor);

		// Fibonacci series from 1 to 10.

		int[] num = new int[10];
		num[0] = 0;
		num[1] = 1;

		for (int i = 2; i < num.length; i++) {
			num[i] = num[i - 2] + num[i - 1];
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
		System.out.println("=======================");
		// Factorial of a number.
		int number1 = 3;
		int fact = 1;
		for (int i = number1; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of Given number " + number1 + " : " + fact);

		// Swap two number s without using the third variable.
		System.out.println("==================================");

		int num1 = 4;
		int num2 = 6;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("number 1 :" + num1 + " And number 2 : " + num2);

		System.out.println("======================");
		// find the greatest of three numbers.
		int a = 9;
		int b = 11;
		int c = 7;
		if (a > b && a > c) {
			System.out.println("Greatest number among three number is " + a);
		} else if (b > a && b > c) {
			System.out.println("Greatest number among three number is " + b);
		} else {
			System.out.println("Greatest number among three number is " + c);
		}

		System.out.println();
		// An Array of numbers given. .Find the largest two number and print it
		System.out.println("An Array of numbers given.Find the largest two number and print it");

		int[] arr = { 1, 2, 4, 6, 8, 9, 8, 9 };

		int maxOne = 0;
		int maxTwo = 0;
		for (int numarr : arr) {
			if (maxOne < numarr) {
				maxTwo = maxOne;
				maxOne = numarr;
			} else if (maxTwo < numarr) {
				maxTwo = numarr;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);

		System.out.println();
		System.out.println("==================");
		System.out.println("Que. Reverse a number.");

		int n = 1234;
		int reverse = 0;
		while (n != 0) {
			int temp = n % 10;
			reverse = reverse * 10 + temp;
			n = n / 10;
		}
		System.out.println("Reverse number is : " + reverse);

		System.out.println();
		// A palindromic number

		int numberP = 123321;
		int polindrom = 0;
		int actualNum = numberP;

		while (numberP != 0) {
			int temp = numberP % 10;
			polindrom = polindrom * 10 + temp;
			numberP = numberP / 10;

		}
		if (actualNum == polindrom) {
			System.out.println("Given number is Polindrom : " + polindrom);
		} else {
			System.out.println("Given number is not a Polindrom : " + polindrom);
		}

		System.out.println();
		// Armstrong number program.

		int armNum = 153;
		double armstrong = 0;
		int actualNumber = armNum;

		while (armNum != 0) {
			int temp = armNum % 10;
			armstrong = armstrong + Math.pow(temp, 3);
			armNum = armNum / 10;

		}
		if (actualNumber == armstrong) {
			System.out.println("Given number is armstrom : " + armstrong);
		} else {
			System.out.println("Given number is not a armstrong : " + armstrong);
		}

		System.out.println();
		// A String is given to remove the white spaces, reverse it and print the only
		// odd position characters.
		String str = "India     Is My    Country";
		char[] cha = str.toCharArray();
		String withoutSpaceString = "";
		String reverseString = "";
		for (int i = 0; i < cha.length; i++) {
			if ((cha[i] != ' ') && (cha[i] != '\t')) {
				withoutSpaceString += cha[i];
			}
		}
		System.out.println(withoutSpaceString);
		for (int i = withoutSpaceString.length() - 1; i > 0; i--) {
			reverseString += withoutSpaceString.charAt(i);
		}
		for (int i = 0; i < reverseString.length(); i += 2)
			System.out.print(reverseString.charAt(i));

		System.out.println();
		// Check if a string is an anagram of another string. create function with
		// return type as boolean
		String str1 = "silent";
		String str2 = "listen";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (ch1.length != ch2.length) {
			System.out.println("Given string are not an anagram");
		}
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				System.out.println("Given string are not an anagram");
				break;
			}
		}
		System.out.println("Given string are anagram");

		System.out.println();
		// A string is given make few characters to upper case as asked.
		String givenString = "anurag";
		char[] chara = givenString.toCharArray();
		for (int i = 0; i < chara.length; i += 2) {
			chara[i] = Character.toUpperCase(chara[i]);
		}
		System.out.println(chara);

		System.out.println();
		// occurance of character in given string
		String occString = "allahabad";
		char[] c1 = occString.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character character : c1) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}