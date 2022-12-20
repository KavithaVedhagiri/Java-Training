import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 60, 100, 178};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Key Value : ");
        int key = in.nextInt();
       int i = 0;
       while(i<arr.length) {
           if (key == arr[i]) {
               System.out.println("Key is Present : " + key);
               break;
           }
           i++;
       }
            if (i == arr.length) {
                System.out.println("Key is Not Present : " + key);
            }
        }
    }

