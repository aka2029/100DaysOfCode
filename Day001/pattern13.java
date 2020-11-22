/*	Zeros & one's pattern program

1
10
101
1010
10101
  
 */

package Day001;

import java.util.Scanner;

public class pattern13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		
		for(int curline = 1; curline <= n; curline++) {
			
			for(int i = 1; i<=curline; i++) {
				int num = 1;
				if(i%2 == 0) {
					num = 0;
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
