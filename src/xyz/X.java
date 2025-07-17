package xyz;
import abc.A;// import a class from abc package
public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X class from xyz package main start ....");
		A.m1();
		pqr.A.m1();// import a class from pqr package by Qualified names method
//////////////////
	}

}
