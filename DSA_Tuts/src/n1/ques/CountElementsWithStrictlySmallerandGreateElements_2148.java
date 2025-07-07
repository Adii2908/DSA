package n1.ques;

public class CountElementsWithStrictlySmallerandGreateElements_2148 {
	
/*	Given an integer array nums, return the number of elements that have both a strictly smaller
	and a strictly greater element appear in nums.
	Example 1:
	Input: nums = [11,7,2,15] Output: 2
	Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
	Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
	In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
			
	Example 2:
	Input: nums = [-3,3,3,90] Output: 2
	Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
	Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and 
	a strictly greater element appear in nums.
*/	
	public static void main( String [] args) {
		int nums [] = {11,7,2,15};
		int nums1 [] = {-3,3,3,90};
		System.out.println(countElements(nums));  
		System.out.println(countElements(nums1));
	}
	
	//Beats 100 % , 0ms , T.C -> O(n) , S.C -> O(1)
	public static int countElements(int[] nums) {
        int smallest = nums[0];
        int highest = nums[0];
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if( nums[i] > highest ){
                highest = nums[i];
            }
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > smallest && nums[i] < highest)
            count++;
        }
        return count;
    }
}
