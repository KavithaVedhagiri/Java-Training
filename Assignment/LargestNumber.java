import java.util.Scanner;
class LargestNumber{
public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int max = 0;
        if (number1 > number2) {
         max = number1;
        } else {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        int maximum = Math.max(number3, Math.max(number1, number2));
        System.out.println("The Largest number is"+" "+maximum);
    }
}
