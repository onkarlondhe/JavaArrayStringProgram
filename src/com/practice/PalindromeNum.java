package com.practice;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter num :");
		
		int num = sc.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem = num%10;
			sum = sum*10+rem;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("num is palindrome");
		else
			System.out.println("num is not palindrome");
		
	}

}
