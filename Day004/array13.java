/*		Kadane's Algo
*/

package Day004;

import java.util.Arrays;

public class array13 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		
		int csum = 0, osum = 0; 
		for(int i = 0; i<arr.length; i++) {
			if(csum >= 0) csum += arr[i];
			else csum = arr[i];
			
			if(csum > osum) osum = csum;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
