package com.swaptwono;

import java.util.Scanner;

public class swapMain {

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
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("Number after swapping : A = " + a + " B = " + b);

		

	}

}
