package com.day9PracticeProblems;
import java.util.*;

public class CouponNumbers {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of coupons required: ");
		//@param N This is used to take input for number of coupons required
		int N = sc.nextInt();
		sc.close();
		
		//This method is used to add elements to the list
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            list.add(i);
        }
        
        //This method is used to shuffle the list
        Collections.shuffle(list);
        for (int i=0; i<N; i++) {
            System.out.println(list.get(i));
        }
    }

}
