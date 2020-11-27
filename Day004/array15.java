/*	Next Permutation

https://leetcode.com/problems/next-permutation/

*/

package Day004;

import java.util.Arrays;

public class array15 {
	static void nextPermutation(int[] arr, int n) {
		int i = n-2;
		while(i>=0 && arr[i] >= arr[i+1]) {
			i--;
		}
		//till now, we determined the position of i
		
		if(i >= 0) {
			int j = n-1;
			while(j>=0 && arr[j] <= arr[i]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i+1,n-1);
	}
	
	static void reverse(int[] arr, int i, int j) {
		if(i < j) {
			swap(arr, i, j);
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i]; 
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,6,2,4};
		int n = arr.length;
		
		nextPermutation(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}
