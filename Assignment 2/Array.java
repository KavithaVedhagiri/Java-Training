import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Array ar = new Array();
		 Firstarray ();
		 ArrayOfIndex();
		 RemoveNumber();
		 PrintingnegativeNumber();
		 count_negative_numbers();
		 getBiggest();
		 getSmallest();
	}

	private static void getSmallest() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of days: ");
		int count = sc.nextInt();
		int[] temperature = new int[count];
		int small = Integer.MAX_VALUE, index = 0;
		for (int i = 0; i < temperature.length; i++) {
			System.out.print("Enter Temperature: ");
			temperature[i] = sc.nextInt();
			// total = total + marks[i];
			if (temperature[i] < small) // 10 8 14 12 9
			{
				small = temperature[i];
				index = i;
			}
		}
		System.out.println("Lowest temperature is " + small + " from Day " + index);

	}

	private static void getBiggest() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of subjects: ");
		int count = in.nextInt();
		int marks[] = new int[count];
		int big = Integer.MIN_VALUE, index = 0, total = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter Mark: ");
			marks[i] = in.nextInt();
			total = total + marks[i];
			if (marks[i] > big) {
				big = marks[i];
				index = i;
				//
			}
		}
		System.out.println("Highest Mark is " + big + " from Subject " + index + " " + "Total of Marks" + total);

	}

	private static void count_negative_numbers() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int count = 0;
		System.out.println("Enter the Value");

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = in.nextInt();
			if (arr[i] < 0) {
				count++;

			}
		}
		System.out.print(count);
	}

	private static void PrintingnegativeNumber() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the Value");

		for (int i = arr.length - 1; i >= 0; i--) {

			arr[i] = in.nextInt();
			if (arr[i] < 0) {
				System.out.print(arr[i]);
			}
		}
	}

	private static void ArrayOfIndex() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the Value");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();

			System.out.println(i);
		}
	}

	private static void RemoveNumber() {
		// TODO Auto-generated method stub
		int key = 30;
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.print("Before Shifting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int index = -1;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			}
		}
		System.out.println();
		System.out.print("After Shifting : ");
		// int i = 2;
		while (index < arr.length - 1) {
			arr[index] = arr[index + 1];
			index++;
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void Firstarray() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Welcome To Java class" + " " + name);

	}

}
