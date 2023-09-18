package com.stringprogram;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter your email : ");
		String email = sc.next();
		String username = "";
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}
			else {
				username = username+email.charAt(i);
			}
		}
		
		System.out.println("UserName is : "+username);
	}

}
