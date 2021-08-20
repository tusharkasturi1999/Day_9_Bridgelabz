package com.day9PracticeProblems;

import java.util.Scanner;

public class ReverseNumber {
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check ");
		//@param Num This is used to take input from user to Reverse
		int Num = sc.nextInt();
		sc.close();
		int revNum=0;
		
		while(Num!=0) {
			revNum=revNum*10+Num%10;
			Num=Num/10;
		}
		System.out.println(revNum);
	}

}
