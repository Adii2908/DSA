package n2.PrefixSum;

import java.util.Arrays;

public class CountSpecialIndex {
	
	//Note: Special Index is after removing it. 
	//sum of even indexed ele = sum of odd indexed ele

	public static void main(String[] args) {
		
		int arr [] = {4 , 3 , 2 , 7 , 6 , -2};
		System.out.println(countIndex(arr));
	}
	
	static int countIndex(int[] arr) {
		
		int n = arr.length;
		
		int [] evenPrefix = new int[n];
		int [] oddPrefix = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			if(i == 0) {
				evenPrefix[i] = arr[i];
				oddPrefix[i] = 0;
			}else {
				evenPrefix[i] = evenPrefix[i-1];
				oddPrefix[i] = oddPrefix[i-1];
				if(i % 2 == 0) {
					evenPrefix[i] += arr[i];
				}else{
					oddPrefix[i] += arr[i];
				}
			}
		}
		int count = 0;
		
		for(int i = 0 ; i < n ; i++) {
			int evenSum = 0;
			int oddSum = 0;
			
			if(i ==0) {
				evenSum = oddPrefix[n-1] - oddPrefix[i];
				oddSum = evenPrefix[n-1] - evenPrefix[i];
			}else {
				evenSum = evenPrefix[i - 1] + (oddPrefix[n-1] - oddPrefix[i]);
				//after removal of assumed special index, right side will be odd array
				//and vice-verssa in below case
				oddSum = oddPrefix[i - 1] + (evenPrefix[n-1] - evenPrefix[i]);
			}
			
			if(evenSum == oddSum) { 
				System.out.println(i);
				count++;
			}
		}
		
		return count;
	}
	
}