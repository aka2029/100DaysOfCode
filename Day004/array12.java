/*	Merge Without Extra Space

https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

*/

// merge the two sorted arrays, without using any extra space!!
package Day004;

import java.util.Arrays;

public class array12 {

	public static void main(String[] args) {
		// First Instinct
		int[] a1 = {0,2,4,6,8};
		int[] a2 = {1,3,5,7,9};
		
		for(int i = 0, j = 0; i<a1.length && j<a2.length; ) {
			if(a1[i] < a2[j]) i++;
			else if(a1[i] > a2[j]) {
				int temp = a1[i];
				a1[i] = a2[j];
				a2[j] = temp;
				i++;
			} else {
				i++;
			}
			Arrays.sort(a1); Arrays.sort(a2);
		}
		
		System.out.println("Since you can't use any extra space: ");
		System.out.println("Arr1: " + Arrays.toString(a1));
		System.out.println("Arr2: " + Arrays.toString(a2));
	}

}
