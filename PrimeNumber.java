package com.day9PracticeProblems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main( String[] args ) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check ");
		//@param N This is used to take input from user to check for Prime Number
		int N = sc.nextInt();
		sc.close();
		for(int i=2;i<=N/2;i++) {
			if(N%i==0)
				flag = true;
		}
		if(flag)
			System.out.println("It is not a Prime Number");
		else
			System.out.println("It is a Prime Number");
	}

}
