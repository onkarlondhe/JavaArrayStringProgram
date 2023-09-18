package com.loops;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num :");
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i=i+2) {
			System.out.println(i);
		}
	}

}
