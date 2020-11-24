/*	Move all -ve nos. to one side of the array
 
	https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
 
 */

package Day002;

public class array05 {
	static void arrRearrange(int[] arr, int size) {
		for(int i = 0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(arr[i] > 0 && arr[j] < 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i : arr) System.out.print(i + " ");
	}

	public static void main(String[] args) {
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int size = arr.length;
		arrRearrange(arr, size);
	}

}
