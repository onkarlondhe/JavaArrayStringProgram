package com.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String wish;
		do {
		System.out.print("enter the num1 : ");
		int n1 = sc.nextInt();
		System.out.print("enter the num2 : ");
		int n2 = sc.nextInt();
		System.out.println("which operation do you want to perform  : ");
		System.out.println("press 1 : addition \n press 2 : substraction \n press 3 : multiplication \n press 4 : division");

		int button = sc.nextInt();
		
		switch(button) {
		
		case 1: System.out.println("sum of n1 and n2 is : "+ (n1+n2));
		break;
		
		case 2: System.out.println("substraction of n1 and n2 is : "+ (n1-n2));
		break;
		
		case 3: System.out.println("multiplication of n1 and n2 is : "+(n1*n2));
		break;
		
		case 4: System.out.println("division of n1 and n2 is : "+(n1/n2));
		break;
		
		default: System.out.println("wrong creadential...");
		}
		System.out.println("do you want to perform more operation");
		wish = sc.next();
		
		}while(wish.equalsIgnoreCase("yes"));
		
	   
	}

}
