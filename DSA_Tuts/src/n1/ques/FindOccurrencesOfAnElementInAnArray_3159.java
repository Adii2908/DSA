package n1.ques;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindOccurrencesOfAnElementInAnArray_3159 {

	public static void main(String[] args) {
/*		int [] nums = {1,3,1,7}, queries = {1,3,2,4}; int x = 1 ;
		System.out.println(Arrays.toString( occurrencesOfElement(nums,queries,x)));
		
		int [] nums1 = {1,2,3}, queries1 = {10}; int x1 = 5 ;
		System.out.println(Arrays.toString( occurrencesOfElement(nums1,queries1,x1)));
		
		int [] nums2 = {1,4,3,3,6,4,8,3,10}, queries2 = {1,2,1,1,1,1,2,2,1,1}; int x2 = 7 ;
		System.out.println(Arrays.toString( occurrencesOfElement(nums2,queries2,x2))); */
		
		int [] nums3 = {1,3,2,2,3,3,1,3,1}, queries3 = {5,6,1,5,6,4,1,5}; int x3 = 3 ;
		System.out.println(Arrays.toString( occurrencesOfElement(nums3,queries3,x3)));

	}
	
	public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
		
		//not bruteforce but optimized- beats 87.97% 5ms, T.C -> O(n + q), S.C -> O(n + q)
		//if want 100% then instead of using List, use array 
        
		List<Integer> indices = new ArrayList<>();
		for(int i = 0; i < nums.length ; i++ ) {
			if(nums[i] == x) {
				indices.add(i); // 1, 4, 5, 7
			}
		}
		
		int [] result = new int[queries.length];
		for(int i = 0 ; i < queries.length ; i++) {
			if(queries[i] <= indices.size()) {
				result[i] = indices.get( queries[i] - 1 );
			}else {
				result[i] = -1;
			}
		}
		return result;
    }
}
