/* Sandglass star pattern
    
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/

package Day001;

import java.util.Scanner;

public class pattern06 {
		static void print_spaces1(int curline) {
			int spaces = curline-1;
			while(spaces>0) {
				System.out.print(" ");
				--spaces;
			}
		}
		static void print_this1(int curline, int n) {
			int astrisk = n-(curline-1);
			while(astrisk>0) {
				System.out.print("* ");
				--astrisk;
			}
		}
		
		
		static void print_spaces2(int curline, int n) {
			int spaces = n-curline;
			while(spaces>0) {
				System.out.print(" ");
				--spaces;
			}
		}
		static void print_this2(int curline, int n) {
			int astrisk = curline;
			while(astrisk>0) {
				System.out.print("* ");
				--astrisk;
			}
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the no. of lines: ");
			int n = scanner.nextInt();

			for(int curline = 1; curline<=n; curline++) {
				print_spaces1(curline);
				print_this1(curline,n);
				System.out.println();
			}
			
			for(int curline = 1; curline<=n; curline++) {
				print_spaces2(curline, n);
				print_this2(curline, n);
				System.out.println();
			}
		}
}
