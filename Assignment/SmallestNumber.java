import java.util.Scanner;
class SmallestNumber{
public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int min = 0;
        if (number1 < number2) {
         min = number1;
        } else {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        int minimum = Math.min(number3, Math.min(number1, number2));
        System.out.println("The Smallest number is"+" "+minimum);
    }
}
