/* The Pyramid Program
    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/

package Day001;

import java.util.Scanner;

public class pattern01 {
	
	static void print_spaces(int curline, int n) {
		int spaces = n-curline;
		while(spaces>0) {
			System.out.print(" ");
			--spaces;
		}
	}
	static void print_this(int curline) {
		int astrisk = curline;
		while(astrisk>0) {
			System.out.print("* ");
			--astrisk;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		
		for(int curline = 1; curline<=n; curline++) {
			int spaces = n-curline;
			while(spaces>0) {
				System.out.print(" ");
				--spaces;
			}
			
			int print_this = curline;
			while(print_this>0) {
				System.out.print("* ");
				--print_this;
			}
			System.out.print("\n"); //for going to next line
		}
		*/
		
		
//		Method 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of lines: ");
		int n = scanner.nextInt();
		
		for(int curline = 1; curline<=n; curline++) {
			print_spaces(curline,n);
			print_this(curline);
			System.out.println();
		}
	}

}
