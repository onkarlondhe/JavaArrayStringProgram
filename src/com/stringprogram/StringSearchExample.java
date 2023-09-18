package com.stringprogram;

public class StringSearchExample {

	public static void main(String[] args) {

		String paragraph = "Hello everyone my name is onkar ramesh londhe. i am from solapur";
		
		System.out.println(paragraph.substring(26, 31));
		String search = "onkar";
		
		if(paragraph.contains(search)) 
			System.out.println("the string "+search+" was found");
		else 
			System.out.println("the string "+search+" was not found");
	}

}
