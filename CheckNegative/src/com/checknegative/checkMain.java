package com.checknegative;

import java.util.Scanner;

public class checkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		System.out.println("Enter two number to check");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextInt();

		if(a<0)
			System.out.println("No is negative");
		
		else if(a==0)
			System.out.println("Zero");
		
		else
			System.out.println("Positive");

	}

}
