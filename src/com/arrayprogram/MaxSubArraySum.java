package com.arrayprogram;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int result = maxSubArray(nums);
		System.out.println(result);

	}

	private static int maxSubArray(int[] nums) {
		
		int maxNum = nums[0];
		
		int currentNum = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums == null || nums.length==0) {
				return 0;
			}
			currentNum = Math.max(nums[i], currentNum+nums[i]);
			System.out.println(currentNum);
			maxNum = Math.max(maxNum, currentNum);
			
		}
		
		return maxNum;
	}

}
