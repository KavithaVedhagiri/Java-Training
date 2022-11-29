class Pattern1{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FirstOne();
		 SecoundOne();
		 ThirdOne();
		 FourthOne();
		 FifthOne();
	}

	private static void FifthOne() {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("X ");
				} else {
					System.out.print("@ ");
				}
			}
			System.out.println();

		}
	}

	private static void FourthOne() {
		// TODO Auto-generated method stub
		int n = 5;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row + col == n + 1) {
					System.out.print("x ");
				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}
	}

	private static void ThirdOne() {
		// TODO Auto-generated method stub
		int n = 5;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == col) {
					System.out.print("x ");
				} else {
					System.out.print("O ");
				}

			}
			System.out.println();
		}
	}

	private static void SecoundOne() {
		// TODO Auto-generated method stub
System.out.println();
		int n = 5;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == col || col == n - row + 1)// or use col+row==n+1
				{
					System.out.print("x ");
				} else {
					System.out.print("O ");

				}
			}
			System.out.println();
		}
	}

	private static void FirstOne() {
		// TODO Auto-generated method stub
		int n = 5;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == n / 2 + 1 || col == n / 2 + 1) {
					System.out.print("x ");
				} else {
					System.out.print("0 ");

				}
			}
			System.out.println();

		}
	}

}

