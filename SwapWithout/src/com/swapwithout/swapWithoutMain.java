package com.swapwithout;

import java.util.Scanner;

public class swapWithoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		System.out.println("Enter two number to swap");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextInt();
		System.out.println("Enter sceond number : ");
		b = sc.nextInt();
		
		System.out.println("Number before swapping : A = " + a + " B = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Number after swapping : A = " + a + " B = " + b);

	}

}
