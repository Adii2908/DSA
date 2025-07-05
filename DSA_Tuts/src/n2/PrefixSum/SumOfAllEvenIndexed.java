package n2.PrefixSum;

import java.util.Arrays;

public class SumOfAllEvenIndexed {

	public static void main(String[] args) {
		
		int [] arr = {2,3,1,6,4,5};
		System.out.println(Arrays.toString(evenIndexedCumulativeArray(arr)));
		
		int [] arr1 = {2,3,1,6,4,5,9};
		System.out.println(Arrays.toString(evenIndexedCumulativeArray(arr1)));
	}
	
	public static int [] evenIndexedCumulativeArray(int [] arr) {
		int prefixSum [] = new int[arr.length];
		prefixSum[0] = arr[0];
		prefixSum[1] = arr[0];
		for(int i = 2 ; i < arr.length ; i++) {
			if(i % 2 == 0) {
				prefixSum[i] = prefixSum[i - 2] + arr[i];
			}else {
				prefixSum[i] = prefixSum[i-1];
			}
		}
			System.out.println(prefixSum[arr.length - 1]);
			return prefixSum;
	}
}
