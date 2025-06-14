package Aditi;

public class P30 {
	public static void butterfly(int n) {
		// 1st half
		for (int i = 1; i <= n; i++) {
			// Left stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Middle spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// Right stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2nd half
		for (int i = n; i >= 1; i--) {
			// Left stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Middle spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// Right stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		butterfly(4);
	}
}
