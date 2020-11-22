/* Alphabet A pattern
 
 * 
* *
***
* *
* *
* *
 
 */

package Day001;

import java.util.Scanner;

public class pattern07 {
	static void upperPart(int n) {
		int count = n - 2;

		System.out.print(" ");
		for (int newCount = 1; newCount <= count; newCount++) {
			System.out.print("*");
		}
		System.out.println();

		while (count > 0) {
			for (int asterisks = 1; asterisks <= n; asterisks++) {
				if (asterisks == 1 || asterisks == n) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
			--count;
		}
	}

	static void straightLine(int n) {
		int ast = n;
		while (ast > 0) {
			System.out.print("*");
			--ast;
		}
		System.out.println();
	}

	static void lowerPart(int n) {
		int count = n;

		while (count > 0) {
			for (int asterisks = 1; asterisks <= n; asterisks++) {
				if (asterisks == 1 || asterisks == n) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
			--count;
		}
	}

	public static void main(String[] args) {
//		my goal was to make a dynamic A alphabet & not a static one.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of A: ");
		int n = scanner.nextInt();

		upperPart(n);
		straightLine(n);
		lowerPart(n);
	}
}
