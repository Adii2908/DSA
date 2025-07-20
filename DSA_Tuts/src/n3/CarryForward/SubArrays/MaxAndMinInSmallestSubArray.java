package n3.CarryForward.SubArrays;

public class MaxAndMinInSmallestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 6, 5, 4, 9, 5, 8, 1, 2};
		//findSubArrayBruteForce(arr);
		//findSmallestOptimized(arr);
		findSubarrayOptimized(arr);
	}
	
	static void findSubArrayBruteForce(int [] arr) {
		int ans = 0;
		int smallest = arr[0];
		int largest = arr[0];
		
		
		for(int i = 0; i < arr.length ; i++) {
			if( arr[i] > largest) {
				largest = arr[i]; // 9
			}
			if(arr[i] < smallest) {
				smallest = arr[i]; // 1
			}
		}
		
		for(int i = smallest ; i < arr.length ; i++) {
			for(int j = i ; j < arr.length ; j++) {
				boolean min = false , max = false;
				for(int k = i ; k <= j ; k++) {
					if(arr[k] == smallest) min = true;
					if(arr[k] == largest) max = true;
				}
				
				if(min && max) {
					if(ans == 0) ans = j -i + 1;
					if(j -i + 1 < ans ) ans = j - i + 1;
				}
			}
		}
		System.out.println(ans);
	}
	
	static void findSmallestOptimized(int [] arr) {
		int ans = 0;
		int smallest = arr[0];
		int largest = arr[0];
		
		
		for(int i = 0; i < arr.length ; i++) {
			if( arr[i] > largest) {
				largest = arr[i]; // 9
			}
			if(arr[i] < smallest) {
				smallest = arr[i]; // 1
			}
		}
		for(int i = smallest ; i < arr.length ; i++) {
			boolean min = false , max = false;
			for(int j = i ; j < arr.length ; j++) {
					if(arr[j] == smallest) min = true;
					if(arr[j] == largest) max = true;
				
				if(min && max) {
					if(ans == 0) ans = j -i + 1;
					if(j -i + 1 < ans ) { 
						ans = j - i + 1;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	static void findSubarrayOptimized(int [] arr) {
		
		int min_index = -1, max_index = -1, length= 0, ans = 0;
		int min = arr[0], max= arr[0], n = arr.length;
		
		for(int i = 0 ; i < n - 1 ; i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		for(int i = n-1 ; i >= 0 ; i-- ) {
			if( arr[i] == min) {
				min_index = i;
				if(max_index != -1) {
					length = max_index - min_index + 1;
					if(ans == 0) ans = length;
					if(length < ans ) ans = length;
				}
			}
			if(arr[i] == max) {
				max_index = i;
				if(min_index != -1) {
					length =  min_index - max_index + 1;
					if(ans == 0) ans = length;
					if(length < ans ) ans = length;
				}
			}
		}
		System.out.println(ans);
	}
}
