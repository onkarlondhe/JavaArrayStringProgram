package com.arrayprogram;

public class MaxMinNum {

	public static void main(String[] args) {

		int num[] = {10,20,5,4,15,7};
		
		int min=num[0];
		
		int max=num[0];
	
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
				
		}
		System.out.println("max num is "+max);
		System.out.println("min num is "+min);

	}

}
