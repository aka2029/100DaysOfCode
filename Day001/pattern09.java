/*	Simple number program
  
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
  
 */

package Day001;

import java.util.Scanner;

public class pattern09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		
		for(int curline = 1; curline <= n; curline++) {
			for(int count = 1; count <= curline; count++) {
				System.out.print(count + " ");
			}
			
			System.out.println();
		}
	}
}
