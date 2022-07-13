package com.brideglabz;
import java.util.*;
public class Stopwatch {

	public static void main(String[] args) {
		System.out.println("Enter any interger to start stopwatch");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println("Stopwatch Started");
		System.out.println("Enter any interger to end stopwatch");
		int y = sc.nextInt();
		long end = System.currentTimeMillis();
		int sec = (int)(end-start)/1000;
		int dsec = sec%60;
		int min = (int)(sec-dsec)/60;
		int dmin =  min%60;
		int hrs = (min-dmin)/60;
		System.out.println("Total elapsed time in stop watch in seconds "+hrs+":"+dmin+":"+dsec);
	}
}
