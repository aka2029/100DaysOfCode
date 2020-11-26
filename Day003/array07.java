/*	Cyclically rotate an array by one
  
  https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0
  
 */

package Day003;

public class array07 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		int temp = arr[n-1];
		for(int i = n-2; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
