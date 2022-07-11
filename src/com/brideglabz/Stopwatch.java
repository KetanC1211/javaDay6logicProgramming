package com.brideglabz;
import java.util.*;
public class Stopwatch {

	public static void main(String[] args) {
		System.out.println("Enter any interger to start stopwatch");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println("Stopwatch Started");
		System.out.println("Enter any interger to start stopwatch");
		int y = sc.nextInt();
		long end = System.currentTimeMillis();
		int sec = (int)(end-start)/1000;
		//int min = (int)(end-start)/60*60;
		System.out.println("Total elapsed time in stop watch in seconds "+sec);
	}
}
