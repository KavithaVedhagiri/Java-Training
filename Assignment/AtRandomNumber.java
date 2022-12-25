import java.util.Scanner;
import java.util.Random;
public class AtRandomNumber {
    public static void main(String[] args)
    {
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter minimum range: ");
        int minRange = SC.nextInt();

        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();

        for(int loop=minRange; loop<=maxRange; loop++)
        {
            System.out.println(rand.nextInt(maxRange - minRange) + minRange);
        }
    }
}
