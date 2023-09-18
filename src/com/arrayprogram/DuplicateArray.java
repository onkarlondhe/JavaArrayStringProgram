package com.arrayprogram;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = {12,1,2,5,7,3,12,8,5};
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate array element: "+arr[i]);
				}
			}
		}
				
	}

}
