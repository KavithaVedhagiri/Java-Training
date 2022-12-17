import java.util.Scanner;

public class ShiftLeftArray {
    public static void main(String[] args) {
        ShiftLeftArray sa = new ShiftLeftArray();
        //sa.copyingarray();
        //sa.copyingarray1();
        //sa.copyingarray2();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Element : ");
        int n = in.nextInt();
        int[] element = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Enter array Element "+(i+1));
            element[i]=in.nextInt();
        }
        System.out.println("Original Elements :");
        for (int i = 0;i<n;i++){
            System.out.print(element[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Elements :");
        for (int i = n-1;i>=0;i--){
            System.out.print(element[i]+" ");
        }
    }


    private void copyingarray2() {
        int arr[] = {10, 20, 30, 40, 50};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            arr1[i]=arr[i];
        arr[3]=70;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Copied Array : ");
        for (int j = 0; j < arr1.length; j++) {

            System.out.print(arr1[j]+" ");
        }

    }

    private void copyingarray1() {
        int arr[] = {10, 20, 30, 40, 50};
        int arr1[] = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr[4] = 90;
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Copied Array : ");
        for (int j = 0; j < arr1.length; j++) {

            System.out.print(arr1[j]+" ");
        }

    }


    private void copyingarray() {
        int arr[] = {10, 20, 30, 40, 50};
        int arr1[] = arr;
        System.out.println("Original Array : ");
        arr[4] = 90;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }
            System.out.println();
            System.out.println("Copied Array : ");
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(arr1[j]+" ");
            }

        }
    }


