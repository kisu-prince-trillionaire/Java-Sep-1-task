package com.primenumber;

import java.util.Scanner;

public class primeMain {
	static boolean isPrime(int n) {
		if (n<=1)
			return false;
		
		else if(n==2)
			return true;
		
		else if(n%2 == 0)
			return false;
		
		for(int i =3; i<= Math.sqrt(n); i+=2 ) {
			if(n%i == 0) {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n;
		n = sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is a Prime Number ");
		}
		else
			System.out.println(n + " is not a Prime Number ");

	}

}
