/*	Find Kth smallest number in an array
  
  https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
  
 */

package Day002;

import java.util.Arrays;
import java.util.Scanner;

public class array03 {
	//This isn't the optimal solution : https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
	// This link is for future reference [do by heap and quicksort]
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of arrays, you wanna put: ");
		int quantity = scanner.nextInt();
		
		for(int i = 1; i<=quantity; i++) {
			System.out.println("Enter the size of your array " + i);
			int size = scanner.nextInt();
			int[] arr = new int[size];
			
			System.out.println("Now, enter the elements: ");
			for(int j = 0; j<size; j++) arr[j] = scanner.nextInt();
			
			System.out.println("Enter K: ");
			int k = scanner.nextInt();
			
			//put the method here because another array is going to come.
			Arrays.sort(arr);
			System.out.println("Kth smallest number is: " + arr[k-1]);
		}
	}
}
