/*	Find the Duplicate Number

https://leetcode.com/problems/find-the-duplicate-number/

*/

package Day004;

public class array11 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		// find the duplicate
		// we already know that only 1 no. is repeating
		int k = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					k = arr[i];
					break;
				}
			}
		}
		
		if(k != 0) System.out.println(k);
		else System.out.println("No duplicate exists");
	}
}
