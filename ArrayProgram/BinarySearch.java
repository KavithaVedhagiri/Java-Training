import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 80, 76, 46, 50};
        int min = 0;
        int max = ar.length - 1;
        System.out.println("Enter The Key Value :");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        while (min <= max) {
            int mid = (min + max) / 2;
            if (key == ar[mid]) {
                System.out.println("Key is Present " + mid);
                break;
            } else if (key > ar[mid]) {
                min = mid + 1;

            } else if (key < ar[mid]) {
                max = mid - 1;

            }
        }
        if (min > max) {
            System.out.println("Not Present");
        }
    }
}