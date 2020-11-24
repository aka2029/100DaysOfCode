/*	Reverse an array

https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
  
Read: How to declare dynamic array in java using scanner
https://www.tutorialspoint.com/How-to-declare-Java-array-with-array-size-dynamically
 */

package Day002;

import java.util.Scanner;

public class array01 {
	
	static void recursiveReverse(int[] arr, int start, int end) {
		if(start >= end) return;
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			recursiveReverse(arr, ++start, --end);
	}

	public static void main(String[] args) {
/*			First Instinct
		 	
		int[] arr = { 4,5,1,2 };
		boolean checkOdd;
		

		// checking whether the number is even or odd
		if (arr.length % 2 == 0) {
			checkOdd = false;
		} else
			checkOdd = true;

		//now, the real code begins
		if (checkOdd) {
			int len = arr.length - 1;
			for (int i = 0; i <= (arr.length-1)/2; i++) {
				int temp1 = arr[i];
				arr[i] = arr[len];
				arr[len] = temp1;
				len = len-1;
				
			}
		} else {
			int len = arr.length - 1;
			for(int i = 0; i <= (arr.length)/2 -1; i++) {
				int temp1 = arr[i];
				arr[i] = arr[len];
				arr[len] = temp1;
				len = len-1;
			}
		}
		
		for(int i: arr) {
			System.out.print(i + ", ");
		}
		
*/
		
		
/*
		// Iterative
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		//** For entering the elements in array don't use for-each loop
		System.out.println("Now, enter it's elements: ");
		for(int i = 0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//Now, we are ready with the array		
		for(int start = 0, end = size-1; start<end; end--, start++) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
		}
		
		for(int i : arr) System.out.print(i + ", ");
*/
		
		//Recursive approach
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Now, enter it's elements: ");
		for(int i = 0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		recursiveReverse(arr, 0, size-1);
		
		//now, printing
		for(int i: arr) {
			System.out.print(i + ", ");
		}
	}
}
