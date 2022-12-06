class MyName{
public static void main(String args[]){
      for (int row = 1; row <= 7; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col == 1) {
					System.out.print("*  ");
				} else if (row + col == 6 || row - col == 2) {
					System.out.print("*  ");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println(" ");
		}
		// Print Letter A
		for (int col = 1; col <= 5; col++) {
			if (col != 1) {
				System.out.print("* ");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();

		for (int row1 = 1; row1 <= 5; row1++) {
			if (row1 != 3) {
				System.out.print("* ");
				for (int i = 1; i <= 3; i++) {
					System.out.print("  ");
				}
				System.out.println("* ");
			} else {
				for (int col = 1; col <= 5; col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.out.println();
		// Print letter V
		int n = 6;
		int px = 1;
		int py = 2 * n - 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col < 2 * n; col++) {
				if (col == px || col == py)
					System.out.print("*" + "");
				else
					System.out.print(" ");
			}

			px++;
			py--;
			System.out.println();
		}
		// Print letter I

		for (int row = 1; row <= 5; row++) {
			System.out.print("* ");
		}
		System.out.println();

		for (int col = 1; col <= 5; col++) {

			for (int i = 1; i <= 4; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int star = 1; star <= 5; star++) {
			System.out.print("* ");

		}
		System.out.println();
		// Print letter T

		for (int row = 1; row <= 5; row++) {
			System.out.print("* ");
		}
		System.out.println();

		for (int col1 = 1; col1 <= 5; col1++) {

			for (int i = 1; i <= 4; i++) {
				System.out.print(" ");
			}
			{
				System.out.println("*");
			}
		}
		System.out.println();
		// Print letter H
		for (int col = 1; col <= 5; col++) {
			if (col != 3) {
				System.out.print("* ");
				for (int i = 1; i <= 3; i++) {
					System.out.print("  ");
				}
				System.out.println("* ");

			} else {
				for (int i = 1; i <= 5; i++) {
					System.out.print("* ");

				}
				System.out.println();
			}
		}
		// Print letter A
		System.out.println();
		for (int col1 = 1; col1 <= 5; col1++) {
			if (col1 != 1) {
				System.out.print("* ");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();

		for (int row1 = 1; row1 <= 5; row1++) {
			if (row1 != 3) {
				System.out.print("* ");
				for (int i = 1; i <= 3; i++) {
					System.out.print("  ");
				}
				System.out.println("* ");
			} else {
				for (int col1 = 1; col1 <= 5; col1++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}	
}
