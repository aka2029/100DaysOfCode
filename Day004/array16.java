/*	Inversion count

https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

*/

//	Formally, two elements a[i] 
//	and a[j] form an inversion if a[i] > a[j] and i < j.

//	Work on Time Complexity and space complexity
package Day004;

public class array16 {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6};
		int count = 0; 
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					count++;
					swap(arr, i, j);
				}
			}
		}
		
		System.out.println(count);
	}

}
