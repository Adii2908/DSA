package n4.SlidingWindowTechnique;

import java.util.Arrays;

public class SumOfSubArraysAndMaxSum {
//Given array of integers, find sum of all possible subarrays of the array and maintain max sum
// int a [] = {1, 2, 3};
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3};
		usingPrefixSum(a);

	}
	
	public static void usingPrefixSum(int [] arr) {
		int [] cummulativeArray = cummulativeArray(arr);
		int total_sum = 0;
		int maxSubArraySum = cummulativeArray[0];
		
		for(int start = 0 ; start < cummulativeArray.length ; start++) {
			for(int end = start ; end < cummulativeArray.length ; end++ ) {
				int subarraySum = 0;
				if(start == 0) {
					subarraySum = cummulativeArray[end];
				}else {
					subarraySum = cummulativeArray[end] - cummulativeArray[start - 1];
				}
				
				total_sum += subarraySum;
				maxSubArraySum = Math.max(maxSubArraySum, subarraySum);
			}
		}
		
		System.out.println(total_sum);
		System.out.println(maxSubArraySum);
	}
	
	public static int [] cummulativeArray(int [] arr) {
		
		int [] prefixSumArray = new int[arr.length];
		
		prefixSumArray[0] = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			prefixSumArray[i] = arr[i] + prefixSumArray[i-1];
		}
		
		return prefixSumArray;
	}

}
