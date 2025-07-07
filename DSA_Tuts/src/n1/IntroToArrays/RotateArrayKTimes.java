package n1.IntroToArrays;

import java.util.Arrays;

public class RotateArrayKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1 , 2, 3 , 4, 5};
		bruteforce(arr,3);
		System.out.println("brute force" + "T.C -> O(n^2)  S.C -> O(1)");
		System.out.println(Arrays.toString(arr));
		System.out.println(" ");
		int arr1[] = {1 , 2, 3 , 4, 5};
		approach1(arr1,3);
		int arr2[] = {1 , 2, 3 , 4, 5};
		approach2(arr2,3);
	}
	
	static void bruteforce(int [] arr , int k) {
		
		for(int i = 0;  i < k ; i++) {
			int a = arr[arr.length - 1];
			for(int j = arr.length - 2 ; j >= 0 ; j-- ) {
				arr[j+1] = arr[j];
			}
			arr[0] = a;
		}
	}
	
	static void approach1(int arr[] , int k) {
		
		int [] res = new int[arr.length];
		
		for(int i = 0; i <= arr.length - 1 ; i++) {
			int j = ( i + k ) % arr.length;
			res[j] = arr[i];
		}
		
		System.out.println("approach 1 " + " T.C -> O(n)  S.C -> O(n) ");
		System.out.println(Arrays.toString(res));
	}
	
	static void approach2(int arr[] , int k) {
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		System.out.println();
		System.out.println("approach 2" + " T.C -> O(n)  S.C -> O(1) ");
		System.out.println(Arrays.toString(arr));
	}
	
	static void  reverse(int arr [] , int low , int high) {
		
		while(low < high) {
			
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++; 
			high--;
		}
		
		
	}

}
