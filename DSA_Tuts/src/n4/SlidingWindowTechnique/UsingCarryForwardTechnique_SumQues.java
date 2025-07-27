package n4.SlidingWindowTechnique;
//Given array of integers, find sum of all possible subarrays of the array and maintain max sum
//int a [] = {1, 2, 3};
public class UsingCarryForwardTechnique_SumQues {

	public static void main(String[] args) {
		
		int sum = 0;
		int a [] = {1, 2, 3 , 4};
		sumOfAllSubArraysAndMaxSum(a);
	}
	
	public static void sumOfAllSubArraysAndMaxSum(int [] a ) { // t.c -> O(n^2)
		
		int total_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < a.length ; i++) {
			int sum = 0 ;
			for(int j = i ; j < a.length ; j++) {
				sum += a[j];
				total_sum += sum;
				max_sum = Math.max(max_sum, sum);
			}
		}
		System.out.println(max_sum);
		System.out.println(total_sum);
	}
}
