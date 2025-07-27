package n1.ques;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {

	public static void main(String[] args) {
		
		int [] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
		System.out.println(efficientApproach(nums));
	}
	
	public static int removeDuplicates(int [] nums) {
		
		int arr[] = new int[nums.length];
		arr[0] = nums[0]; int dupes = 0; int k = 1;
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i] == nums[i - 1]) {
				dupes++;
			}else {
				arr[k] = nums[i];
				k++;
			}
		}
		//nums = arr;
		boolean a = false; int count  = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(a == false && arr[i] == 0 ) {
				count++;
				nums[i] = arr[i];
				a = true;
			}
			if(arr[i] != 0) {
				if(arr[i] > 0) a = true;
				nums[i] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums.length - dupes;
	}
	
	public static int efficientApproach(int [] nums) {
		if(nums.length == 0) return 0;
		
		int i = 0;
		for(int j = 1 ; j < nums.length ; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
}
