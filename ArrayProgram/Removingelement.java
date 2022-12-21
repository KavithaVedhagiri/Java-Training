import java.util.Arrays;

public class Removingelement {
    public static void main(String[] args) {
        int ar[] = {10, 40, 50, 20, 30};
        int ar1[] = new int[ar.length-1];
        int j = 3;
        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i != j) {
                ar1[k] = ar[i];
                k++;
            }
        }
        System.out.println("Before Deletion : "+ Arrays.toString(ar));
        System.out.println("After Deleteion : "+Arrays.toString(ar1));
    }
}