/*	Minimum number of jumps to reach the end

https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1#

*/

package Day003;

public class array10 {
	static int minJumps(int[] arr){
        // your code here
        int count = 0; 
        for(int i = 0; i< arr.length ; i++) {
            if(arr[i] == 0) {
                return -1;
            }
            else {
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = minJumps(arr);
		System.out.println(n);
	}
}
