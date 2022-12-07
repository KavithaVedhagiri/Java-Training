import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		
		System.out.println("The square root of " + no + " is: " + squareRoot(no));
	}

	public static double squareRoot(int num) {

		double value;
		double sqrtroot = num / 2;
		do {
			value = sqrtroot;
			sqrtroot = (value + (num / value)) / 2;
		} while ((value - sqrtroot) != 0);
		return sqrtroot;
	}
}

