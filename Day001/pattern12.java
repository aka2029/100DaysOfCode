/*	Binary number pattern
 
10101
01010
10101
01010
10101
  
 */

package Day001;

import java.util.Scanner;

public class pattern12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		int num;
		
		for(int count = 1; count <= n; count++) {
			num = (count%2 == 0)?0:1;
			
			for(int pthis = 1; pthis <= n; pthis++) {
				System.out.print(num);
				num = (num+1)%2;
			} System.out.println();
		}
	}
}
