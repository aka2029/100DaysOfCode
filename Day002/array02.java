/*	Find min and max element in an array
 
 https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
  
 */

package Day002;

import java.util.Arrays;
import java.util.Scanner;

public class array02 {
	public static void main(String[] args) {
		
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Now, enter the array elements: ");
		for(int i = 0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//	First Instinct
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i<size; i++) {
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
		}
		
		System.out.println(min + " is min & max is " + max);
		
		
		/* or Could also do this
		Arrays.sort(arr);
		System.out.println(arr[0] + " is min & max is " + arr[arr.length-1]);
		*/
	}
}
