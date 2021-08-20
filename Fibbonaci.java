package com.day9PracticeProblems;
import java.util.*;

public class Fibbonaci {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		//@param n1,n2,n3 required for first, second and third terms
    	int n1=0,n2=1,n3,i,number;    
    	System.out.println("Enter the length of the series ");
   	 	number = sc.nextInt();
   	 	sc.close();
   	 	
   	 	//Printing 0 & 1
   	    System.out.print(+n1+"\t"+n2+"\t");
   	    
   	    // This is the loop for fibbonaci method
   	    for(i=2;i<number;++i){//loop starts from 2 because 0 and 1 are already printed    
   	    
   	    	n3=n1+n2;    
   	    	System.out.print(+n3+"\t");    
   	    	n1=n2;    
   	    	n2=n3;    
   	    }  
    }
}
