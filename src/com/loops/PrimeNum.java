package com.loops;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt(); 
		int count=0;
		for(int i =1; i<=num; i++) {
			if(num%i==0) {
				count = count + 1;
			}
		}
		
		if(count==2) 
			System.out.println("Num is Prime");
		else
			System.out.println("Num is NotPrime");
	
	}

}
