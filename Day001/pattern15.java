/*	Diamond pattern

     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
  
 */

package Day001;

import java.util.Scanner;

public class pattern15 {
	static int alphabet = 65;

	static void upperPart(int n) {
		for (int curline = 1; curline <= n; curline++) {
			// spaces
			int spaces = n - curline;
			while (spaces > 0) {
				System.out.print(" ");
				--spaces;
			}

			// printing
			System.out.print((char) alphabet);
			for (int count = 1; count <= (2 * (curline - 1) - 1); count++) {
				System.out.print(" ");
			}

			if (curline != 1) {
				System.out.print((char) alphabet);
			}

			System.out.println();
			alphabet++;
		}
		alphabet = alphabet - 2;
	}

	static void lowerPart(int n) {
		for (int curline = n - 1; curline >= 1; curline--) {
			// spaces
			int spaces = n - (curline);
			while (spaces > 0) {
				System.out.print(" ");
				--spaces;
			}

			// printing
			System.out.print((char) alphabet);
			for (int count = 1; count <= (2 * (curline - 1) - 1); count++) {
				System.out.print(" ");
			}

			if (curline != 1) {
				System.out.print((char) alphabet);
			}

			System.out.println();
			alphabet--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Diamond: ");
		int n = scanner.nextInt();

		upperPart(n);
		lowerPart(n);
	}
}
