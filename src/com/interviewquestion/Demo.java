package com.interviewquestion;

public class Demo {

	public static void main(String[] args) {

		int arr1[] = {1,2,3};
		int arr2[] = {10,20,30};
		
		int arr3[]= mergeArray(arr1,arr2);
		printArray(arr3);
	}

	private static void printArray(int[] arr3) {

		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}

	private static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int arr3[] = new int[len1+len2];
		
		int index=0;
		
		for(int i=0; i<len1; i++) {
			arr3[index++]=arr1[i];
			arr3[index++]=arr2[len2-1-i];
		}
		return arr3;
		
		
		
	}

}
