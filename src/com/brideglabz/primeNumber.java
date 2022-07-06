package com.brideglabz;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		System.out.println("Enter number greater than 1");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println("Invalid Input");
		}
		if(n==2){
			System.out.println("Entered number is prime");
		}		
		for(int i=2;i<n;i++) {
			if(n==2) {
				break;
			}
			if (n%i==0) {
				System.out.println("Entered number is not a Prime");
				System.exit(0);
			}
		}
		System.out.println("Entered number is a Prime");
	}
}
