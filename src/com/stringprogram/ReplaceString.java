package com.stringprogram;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		String result = "";
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='e') {
				result = result + 'i';
			}else {
				result = result +name.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
