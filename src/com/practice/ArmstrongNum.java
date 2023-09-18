package com.practice;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = sc.nextInt();
		int count=0;
		int temp1 = num;
		int temp2=num;
 		int result=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		
 		
 		while(temp1!=0) {
			int rem = temp1%10;
			result = result + (int) Math.pow(rem,count);
			temp1=temp1/10;
		}
 		
 		if(temp2==result)
			System.out.println("Armstrong num");
		else
			System.out.println("Not armstrong num");
	}
	

}
