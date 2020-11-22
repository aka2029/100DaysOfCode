/* Left triangle star pattern
    
           * 
         * * 
       * * * 
     * * * * 
   * * * * *

*/

package Day001;

import java.util.Scanner;

public class pattern03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of lines: ");
		int n = scanner.nextInt();
		
//		first this was causing problem then, instead of using space, i used tab
		for (int curline = 1; curline <= n; curline++) {
			
			int spaces = n - curline;
			while(spaces > 0) {
				System.out.print("	");
				--spaces;
			}
			
			int print_this = curline;
			while(print_this > 0) {
				System.out.print("*	");
				--print_this;
			}
			System.out.println();
		}
	}
}
