package com.maximum;

import java.util.Scanner;

public class maximumMain {
	
	public int maximumOfThree(int a, int b, int c) {
		if(a>=b && a>=c)
		    return a;
		
		else if(b>=a && b>=c)
			return b;
		
		else
			return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextInt();
		System.out.println("Enter sceond number : ");
		b = sc.nextInt();
		System.out.println("Enter third number : ");
		c = sc.nextInt();
		
		maximumMain obj = new maximumMain();
		int greatest = obj.maximumOfThree(a, b, c);
		System.out.println(greatest + " is the maximum of three");

		


	}

}
