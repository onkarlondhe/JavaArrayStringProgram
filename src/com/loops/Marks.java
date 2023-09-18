package com.loops;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.println("enter your marks..");
			int marks = sc.nextInt();
			if(marks>=90 && marks<=100) {
				System.out.println("this is Good");
			}else if(marks>=80 && marks<90){
				System.out.println("this is Good 1");
			}else if(marks>=50 && marks<=60) {
				System.out.println("this is Good as well");
			}else {
				System.out.println("Fail");
			}
			System.out.println("do you want to continue? if yes press 1 else press 0");
			input = sc.nextInt();
		}while(input==1);
	}

}
