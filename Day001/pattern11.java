/*	Pascal's triagle program
  

        1
      1   1
    1   2   1
  1   3   4   1
1   5   6   7   1 
  
 */

package Day001;

import java.util.Scanner;

public class pattern11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();
		
		int numb = 2;
		for(int curline = 1; curline <= n; curline++) {
			//spaces
			int spaces = 2*(n-curline);
			while(spaces > 0) {
				System.out.print(" ");
				--spaces;
			}
			
			for(int count = 1; count <= curline; count++) {
				if(count ==1 || count == curline) {
					System.out.print("1   ");
				} else System.out.print(numb++ + "   ");
			}
			System.out.println();
		}
	}
}
