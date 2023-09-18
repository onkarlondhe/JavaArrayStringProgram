package com.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.nextLine();

		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}

	 
	}


