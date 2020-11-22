/* Right pascal's triangle pattern
    
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*

*/

package Day001;

import java.util.Scanner;

public class pattern05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of lines: ");
		int n = scanner.nextInt();
		
		for (int curline = 1; curline <= n; curline++) {
			int print_this = curline;
			while(print_this > 0) {
				System.out.print("* ");
				--print_this;
			}
			System.out.println();
		}
		
//		now, for downward triangle
		for (int curline = n-1; curline >= 1; curline--) {
			int print_this = curline;
			while(print_this > 0) {
				System.out.print("* ");
				--print_this;
			}
			System.out.println();
		}
	}
}
