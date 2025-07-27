package n1.ques;

public class Majority_Element_169 {

	public static void main(String[] args) {
		
		int [] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}
	
	public static int majorityElement(int nums[]) {
		
		int count = 0;
		int candidate = nums[0];
		for(int num : nums) {
			if(candidate == num) {
				count++;
			}else {
				count--;
				if(count == 0) {
					candidate = num;
					count++;
				}
			}
		}
		return candidate;
	}

}
