/*	Sort an array of 0s, 1s and 2s
  
  https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
  
 */

package Day002;

import java.util.Scanner;

public class array04 {
	static void printArr(int[] arr) {
		for (int i : arr)
			System.out.print(i);
	}

	static void sortArr(int[] arr, int size) {
		// first we'll store nos. then proceed
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

		for (i = 0; i < size; i++) {
			switch (arr[i]) {
			//forgetting these breaks will cause "ArrayOutOfBoundException"
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}

		i = 0;
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}

		printArr(arr);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		System.out.println("Now, enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		/*
		 * Fist instinct but terribly wrong!! Don't know what for(int i = 0; i< size;
		 * i++) { for(int j = i+1; j< size; j++) { int temp = arr[i]; if(temp > arr[j])
		 * { int temp1 = temp; temp = arr[j]; arr[j] = temp1; } } }
		 * 
		 * for (int i : arr) System.out.print(i + " ");
		 */

		/*
		 * //Now, let's just count the no. of 0's, 1's and 2's then print them in the
		 * array int[] arr2 = {0,0,0}; for(int i = 0; i<size; i++) { if(arr[i] == 0)
		 * arr2[0] +=1; else if(arr[i] == 1) arr2[1] += 1; else arr2[2] += 1; }
		 * //counting is done, now fill and print in original for(int i = 0; i <
		 * arr2[0]; i++) { arr[i] = 0; } for(int i = arr2[0]; i < arr2[0] + arr2[1];
		 * i++) { arr[i] = 1; } for(int i = arr2[0] + arr2[1]; i < arr2[0] + arr2[1] +
		 * arr2[2]; i++) { arr[i] = 2; }
		 * 
		 * for(int i : arr) System.out.println(i);
		 */

		// Now, the more professional way of doing the previous method
		sortArr(arr, size);
	}
}
