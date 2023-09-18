package com.arrayprogram;

import java.util.Scanner;

public class AsceOrDescArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the element of array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+",");
		}
		
		int temp = 0;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 
			}else {
				arr[i]=arr[i];
				arr[j]=arr[j];
			}
		}
   }	
		System.out.println("ascending arr");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+",");
		}
		
		
	}

}
