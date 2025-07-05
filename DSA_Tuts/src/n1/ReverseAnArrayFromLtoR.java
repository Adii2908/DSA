package n1;

import java.util.Arrays;

public class ReverseAnArrayFromLtoR {
	
	//T.C -> O(n) , S.C -> O(n)

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		reverse(arr,1,3);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(int [] arr, int l, int r) {
		
		//T.C -> O(n) , S.C -> O(1)
		
		while(l < r) {
			
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			l++; r--;
		}
	}

}
