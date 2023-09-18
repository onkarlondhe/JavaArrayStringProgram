package com.practice;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num : ");
		int num = sc.nextInt();
		int originalNum =num;

		int count=0;
		int temp=num;
		int sum=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		while(temp!=0) {
			int rem= temp%10;
			sum = (int) (sum + Math.pow(rem, count));
			temp=temp/10;
		}
		
		if(originalNum==sum)
			System.out.println(originalNum+" is armstrong");
		else
			System.out.println(originalNum +" is not armstrong");
	}

}
