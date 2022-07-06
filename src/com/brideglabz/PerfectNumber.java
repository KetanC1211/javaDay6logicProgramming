package com.brideglabz;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOfDivisors=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sumOfDivisors += i;
			}
			else {
				continue;
			}
		}
		if(sumOfDivisors==n) {
			System.out.println("Entered number is Perfect number");
		}
		else {
			System.out.println("Entered number is not Perfect number");
		}

	}
}
