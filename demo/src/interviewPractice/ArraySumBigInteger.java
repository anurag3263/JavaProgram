package interviewPractice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySumBigInteger {

	public static void main(String[] args) {
		int size = 0;
//		Size of array --->5
//		Input Data---->1000000001 1000000002 1000000003 1000000004 1000000005
//
//		Output Data---->50000000015
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		size=sc.nextInt();
		int  arr[]=new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		BigInteger sum= BigInteger.valueOf(0);
		for( int i=0;i<=arr.length-1;i++) {

			sum=sum.add(BigInteger.valueOf(arr[i]));
		}
		System.out.println("Array elements are: "+Arrays.toString(arr));
		System.out.println("Sum of array elements is :  "+sum);

	}

}
