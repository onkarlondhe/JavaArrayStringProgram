package com.interviewquestion;

public class Demo1 {

	public static void main(String[] args) {

		String str = "Hello i am Onkar";
		
		String str1[] = str.split(" ");
		
		String str2 ="";
		
		for(String s:str1) {
			String ch = "";
			for(int i=0; i<s.length(); i++) {
				ch = ch + s.charAt(i)+" ";
				break;
			}
			str2 = str2+ch;
		}
		System.out.println(str2);
	}

}
