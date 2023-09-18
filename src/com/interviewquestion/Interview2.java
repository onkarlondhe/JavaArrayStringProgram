package com.interviewquestion;

public class Interview2 {

	public static void main(String[] args) {
		 
		        int[] ar1 = {1, 2, 3};
		        int[] ar2 = {10, 20, 30};

		        int[] ar3 = mergeArrays(ar1, ar2);
		        printArray(ar3);
		    }

		    public static int[] mergeArrays(int[] ar1, int[] ar2) {
		        int len1 = ar1.length;
		        int len2 = ar2.length;
		        int[] ar3 = new int[len1 + len2];

		        int index = 0;
		        for (int i = 0; i < len1; i++) {
		            ar3[index++] = ar1[i];
		            ar3[index++] = ar2[len2 - 1 - i];
		        }

		        for (int i = len2 - len1; i < len2; i++) {
		            ar3[index++] = ar2[i];
		        }

		        return ar3;
		    }

		    public static void printArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println();
		    
		

	}

}
