/* Diamond Star pattern
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
  
 */

package Day001;

import java.util.Scanner;

public class pattern08 {
	static void upperPart(int n) {

		for (int curline = 1; curline <= n; curline++) {
			// spaces
			int spaces = n - curline;
			while (spaces > 0) {
				System.out.print(" ");
				--spaces;
			}

			// printing
			System.out.print("*");
			for (int count = 1; count <= (2 * (curline - 1) - 1); count++) {
				System.out.print(" ");
			}

			if (curline != 1) {
				System.out.print("*");
			}

			System.out.println();
		}
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
			System.out.print("*");
			for (int count = 1; count <= (2 * (curline - 1) - 1); count++) {
				System.out.print(" ");
			}

			if (curline != 1) {
				System.out.print("*");
			}

			System.out.println();
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
