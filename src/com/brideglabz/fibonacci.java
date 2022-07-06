package com.brideglabz;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int sum=0;
		String fseries = String.valueOf(0);
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1;i<n;i++) {
			sum += i;
			fseries += ","+String.valueOf(i);
		}
		System.out.println("Fibonacci Series : "+fseries);
		System.out.println("Sum of n terms is " +sum);
	}

}
