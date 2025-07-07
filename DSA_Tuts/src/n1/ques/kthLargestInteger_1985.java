package n1.ques;

import java.util.Arrays;

public class kthLargestInteger_1985 {

	public static void main(String[] args) {
		
		String [] nums = {"2","21","12","1"};
		int k = 4;
		System.out.println(kthLargestElement(nums,k));
		
	}
	
	public static String kthLargestElement( String [] nums, int k) {
		
		/*
		 * Sorting O(n log n × L) — where L is average string length 
		 * Accessing k-th O(1)
		 * Total Time O(n log n × L)
		 * 
		 * Space ->	O(log n) for sort stack (or O(n) if counting comparator internals)
		 */
		
		Arrays.sort(nums , (a, b) -> { //Comparator
			
			if(a.length() != b.length())
				return b.length() - a.length();// returning descending order
			//a.length() - b.length() -> return ascending order
			return b.compareTo(a);// return descending order
			//a.compareTo(b) -> return ascending order
		});
		System.out.println(Arrays.toString(nums));
		return nums[k - 1];
	}

}
