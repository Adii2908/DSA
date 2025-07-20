package n2.ques;

import java.util.Arrays;

public class FindPivotIndex_724 {

	public static void main(String[] args) {
		int nums[] = {1,7,3,6,5,6};
		//System.out.println(Arrays.toString(cumulativeSumArray(nums)));
		//System.out.println(pivotIndexBuruteForce(nums));
		System.out.println(pivotIndexApproach1(nums));
		
		int nums1[] = {2,1,-1};
		System.out.println(pivotIndexApproach1(nums1));
	}
	
	public static int pivotIndexBuruteForce(int[] nums) {
		
		for(int i = 0 ; i < nums.length ; i++) {
			int countLeft = 0; int countRight = 0;
			for(int j = 0 ; j < i ; j++ ) {
				countLeft += nums[j];
			}
			for(int j = i + 1 ;  j < nums.length ; j++) {
				countRight += nums[j];
			}
			if(countLeft == countRight) {
				return i;
			}
		}
		return -1;
	}
	
	public static int pivotIndexApproach1(int nums[]) {
		
		int arr[] = cumulativeSumArray(nums);
		for(int i = 0 ; i < arr.length ; i++) {
			if(i == 0 ) {
				if( arr[arr.length - 1] == arr[i] )
				 return i;
			}else {
				if( arr[i-1] == arr[arr.length -1] - arr[i])
				return i;
			}
		}
		return -1;
	}
	
	public static int [] cumulativeSumArray(int [] nums) {
		int arr [] = new int[nums.length];
		arr[0] = nums[0];
		for(int i = 1; i < nums.length ; i++) {
			arr[i] = arr[i-1] + nums[i];
		}
		return arr;
	}

}
