package n1.ques;

public class NumberOfGoodPairs_1512 {
	
/*	Given an array of integers nums, return the number of good pairs.A pair (i, j) is called good 
	if nums[i] == nums[j] and i < j.
	
	Example 1:
	Input: nums = [1,2,3,1,1,3]
	Output: 4
	Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
	
	Example 2:
	Input: nums = [1,1,1,1]
	Output: 6
	Explanation: Each pair in the array are good.
	
	Example 3:
	Input: nums = [1,2,3]
	Output: 0 */

	public static void main(String[] args) {
		System.out.println(	numIdenticalPairs(new int[] {1,2,3,1,1,3}));
		System.out.println(	numIdenticalPairs(new int[] {1,1,1,1}));
		System.out.println(	numIdenticalPairs(new int[] {1,2,3}));
	}
	
	//BruteForce , beats 87% , T.C -> O(n^2) , S.C -> O(1)
	public static int numIdenticalPairs(int[] nums) {
        int count = 0;
       for(int i = 0 ; i < nums.length ; i++){
           for( int j = i ; j < nums.length ; j++){
              if( nums[i] == nums[j] && i < j )
               count++;
           }
       }
        return count;
	}
	
	//approach 1 , beats 100% , T.C -> O(n) , S.C -> O(1) -> since it is a fixed size array
		public static int numIdenticalPairs1(int[] nums) {
	        int ans = 0 , countArr [] = new int[101];//since constraint is 100 i.e 1 <= nums.length <= 100
	        for(int i : nums) {
	        	ans = ans + nums[i]++;
	        }
	        return ans; 
		}
}
