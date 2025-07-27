package n3.CarryForward.SubArrays;

public class PrintAllSubArray {
	
	/*Since the task is to print, we cannot avoid O(n²) time — because the number of subarrays 
	in an array of length n is n * (n + 1) / 2. */
	
/*	2,			6,			3,			9
	[0,0]		[1,1]		[2,2]		[3,3]
	[0,1]		[1,2]		[2,3]		1
	[0,2]		[1,3]		2
	[0,3]		3
	4
	
	4+3+2+1 = 10      ((n + n-1 + n-2 + n-3 + ......... + 2 + 1) = n(n+1)/2) */

	public static void main(String[] args) {
		
		int arr[] = {1 , 2 , 3}; 	
		print(arr);
		
	}
	
	public static void print(int[] arr) {
		
		for( int start = 0 ; start < arr.length ; start++) {
			for( int end = start ; end < arr.length ; end++) {
				//print subarray from index start to end
				for(int k = start; k <= end ; k++) {
					System.out.println(arr[k] + " ");
				}
				System.out.println();
			}
		}
	/*	Outer loop: start → starting index of subarray
		Middle loop: end → ending index of subarray
		Inner loop: k → prints elements between start and end */
	/* T.C - o(n^2) , its not O(n3) Because the innermost loop doesn't run n times
	  every time — it runs (end - start + 1) times. The total number of iterations
	  across all subarrays is O(n²) */
	}
}
