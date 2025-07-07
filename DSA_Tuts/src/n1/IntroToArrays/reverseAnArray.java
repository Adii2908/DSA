package n1.IntroToArrays;

import java.util.Arrays;

public class reverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1, 2, 3, 4, 5 };
		reverse(arr);
		System.out.println(Arrays.toString(arr)); 

	}
	
	static void reverse(int[] arr) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			swap(arr , low , high);
			low++;
			high--;
		}
	}
	
	static void swap(int [] arr, int low , int high ) {
		
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

}
