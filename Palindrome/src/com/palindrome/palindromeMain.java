package com.palindrome;

import java.util.Scanner;

public class palindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the number: ");  
	    String reverse = ""; 
        String num = sc.nextLine(); 
	    int length = num.length(); 
	    
	    for ( int i = length - 1; i >= 0; i-- )  
	        reverse = reverse + num.charAt(i);  
	    
	    if (num.equals(reverse))  
            System.out.println("The number " +num +" is  a palindrome.");
	    else  
	        System.out.println("The number " +num +"  is not a palindrome.");     

	}

}
