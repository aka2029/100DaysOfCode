/*	Kadane's Algorithm	
 * https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 * */

package Day003;

public class array08 {

	public static void main(String[] args) {
		//find largest maxsum of contiguous subarray
		int[] arr = {1,2,-1,-2,5};
		
		int csum = 0; 
		int osum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(csum >= 0) {
				csum += arr[i];
			} else {
				csum = arr[i];
			}
			
			if(csum > osum) {
				osum = csum;
			}
		}
		
		System.out.println(osum);
	}

}
