package com.arrayprogram;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "Silent";
		
		boolean result = areAnagram(str1,str2);
		System.out.println(result);
	}

	private static boolean areAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		//convert string to array for sorting purpose..
		
		char[] array1 = str1.toCharArray();
		char[] array2 =str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
				
		return Arrays.equals(array1, array2);
		
		
		
		
	}

}
