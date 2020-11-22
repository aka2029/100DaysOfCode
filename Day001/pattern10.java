/*	Number pattern program
  
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
  
 */

package Day001;

import java.util.Scanner;

public class pattern10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		
		int numb = 1;
		for(int curline = 1; curline <= n; curline++) {
			for(int count = 1; count <= curline; count++) {
				System.out.print(numb++ + " ");
			}
			
			System.out.println();
		}
	}
}
