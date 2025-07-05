package n2.PrefixSum;

import java.util.Arrays;

public class SumOfAllElementFromLtoR {

	public static void main(String[] args) {
		
		int arr [] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int [][] Queries = { {4,8} , {3,7} , {1,3} , {0,4} , {6,9} , {7,7} };
		
		System.out.println("Bruteforce " + "T.C -> O(n^2) , S.C -> O(1) ");
		bruteForce(arr,Queries.length,Queries);
		System.out.println(" ");
		
		
		System.out.println(Arrays.toString(cumulativeSumArray(arr)));
		
		System.out.println(" ");
		System.out.println("Approach1 " + "T.C -> O(n) , S.C -> O(n) ");
		approach1(arr,Queries.length,Queries);
		System.out.println(" ");

	}
	
	static void bruteForce(int [] arr, int q, int[][] queries) {
		
		for(int i = 0 ; i < q ; i++) {
			int sum = 0;
			for(int j = queries[i][0] ; j <= queries[i][1] ; j++) {
				sum += arr[j];
			}
			System.out.println(sum + " -> " + Arrays.toString(queries[i]));
		}
	}
	
	static void approach1(int [] arr, int q, int[][] queries) {
		
		int PrefixSum[] = cumulativeSumArray(cumulativeSumArray(arr));
		
		for(int[] x : queries) {
			int l = x[0];
			int r = x[1];
			
			if(l == 0) {
				System.out.println(PrefixSum[r] + " -> " + Arrays.toString(x));
			}else {
				System.out.println(PrefixSum[r] - PrefixSum[l-1] + " -> " + Arrays.toString(x));
			}
		}
	}
	
	static int [] cumulativeSumArray(int arr[]) {
		
		int [] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			prefixSum[i] =  arr[i] + prefixSum[i-1];
		}
		return prefixSum;
	}
}
