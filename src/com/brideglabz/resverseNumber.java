package com.brideglabz;

import java.util.Scanner;

public class resverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		while(n != 0) {  
		int r = n % 10;  
		reverse = reverse * 10 + r;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
