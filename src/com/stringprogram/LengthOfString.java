package com.stringprogram;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of String arr");
		int length = sc.nextInt();
		int tolength=0;
		String arr[] = new String[length];
		
		for(int i=0; i<length; i++) {
			arr[i]=sc.next();
			tolength = tolength + arr[i].length();
		}
		System.out.println(tolength);


	}

}
