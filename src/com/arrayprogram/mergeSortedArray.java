package com.arrayprogram;

import java.util.Arrays;

public class mergeSortedArray {

	public static void main(String[] args) {

		int[] num1 = {1,3,5,7};
		int[] num2 = {2,4,6,8};
		
		int[] num3 = mergeArray(num1,num2);
		printSortedMergeArray(num3);
		
	}

	private static void printSortedMergeArray(int[] num3) {

		for(int i=0; i<num3.length; i++) {
			 
			
			System.out.print( num3[i]+" ");
		}
		
		int max = num3[0];
		int min = num3[0];
		for(int i=0; i<num3.length; i++) {
			 for(int j=0; j<num3.length; j++) {
				 if(num3[i]>num3[j]) {
					 max = num3[i];
					 
				 }
			 }
			
			 
		}
		
		
	}

	private static int[] mergeArray(int[] num1, int[] num2) {
		
		int len1 = num1.length;
		int len2 = num2.length;
		
		int[] num3 = new int[len1+len2];
		
		int index = 0;
		
		for(int i=0; i<num1.length; i++) {
			
			num3[index++] = num1[i];
			
		}
		
		for(int i=0; i<num2.length; i++) {
			
			num3[index++] = num2[i];
			
		}
		
 		return num3;
	}

}
