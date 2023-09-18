package com.arrayprogram;

public class ReverseArray {
	
	public static void reverseArray(int arr[], int start, int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
		public static void printArray(int arr[], int size) {
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50};
		reverseArray(arr,0,4);
		 
		System.out.print("reverse of array is : ");
		printArray(arr,5);
	}

}
