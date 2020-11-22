/* Right alphabetic triangle

A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
  
 */

package Day001;

import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = scanner.nextInt();

		for (int curline = 1; curline <= n; curline++) {
			for(int i = 0; i<curline; i++) {
				System.out.print((char)(65+i) + " ");
			}System.out.println();
		}
	}
}
