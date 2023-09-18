package com.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		int count=0;
		int temp1 = num;
		int temp2 = num;
		int rev = 0;
		while(temp2!=0) {
			temp2 = temp2/10;
			count = count+1;
		}
		
		while(temp1 !=0) {
			int rem = temp1%10;
			rev =  rev +(int) Math.pow(rem, count);
			temp1 = temp1/10;
		}
		
		if(num == rev) {
			System.out.println("armstrong");
		}else {
				System.out.println("not armstrong");
		}
	}

}
