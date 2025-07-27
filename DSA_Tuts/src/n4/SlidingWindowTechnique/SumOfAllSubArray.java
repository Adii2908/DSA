package n4.SlidingWindowTechnique;

import java.util.Arrays;

public class SumOfAllSubArray {
//Given array of Integers, find total sum of all possible subArrays
//	int [] a = {6, 8, -1, 7};
	public static void main(String[] args) {
		int [] a = {6, 8, -1, 7};
		//System.out.println(Arrays.toString (cummulativeSum(a)));
		usingPrefixSum(a);
	}
	
	public static void usingPrefixSum(int [] a) {
		
		int total_sum = 0 ;
		int [] b = cummulativeSum(a);
		for(int start = 0 ; start < b.length ; start++) {
			for(int end = start ; end < b.length ; end++) {
				int sum = 0;
				if(start == 0) {
					sum += b[end];
				}else {
					sum += b[end] - b[start - 1];
				}
				total_sum += sum;
			}
		}
		System.out.println(total_sum);
	}
	
	public static int[] cummulativeSum(int [] a) {
		
		for(int i = 1 ; i < a.length ; i++) {
			a[i] = a[i] + a[i-1];
		}
		return a;
	}
	

}
