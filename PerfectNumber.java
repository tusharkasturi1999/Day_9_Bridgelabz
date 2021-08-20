package com.day9PracticeProblems;
import java.util.*;
public class PerfectNumber {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check ");
		//@param N This is used to take input from user to check for perfect number
		int N = sc.nextInt();
		sc.close();
		//@param dummy is used to store factors of N
		int dummy=0;
		//This method is used to check for perfect number
		for(int i=1; i<=N/2;i++) {
			if(N%i==0) {
				dummy=dummy+i;
			}
		}
		if(dummy==N) {
			System.out.println("Its a Perfect Number ");
		}
		else {
			System.out.println("It is not a Perfect Number");
		}
	}

}
