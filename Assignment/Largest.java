import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        //Q: Find the largest of the 3 numbers
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.println("The Largest number is"+" "+max);
    }
}
