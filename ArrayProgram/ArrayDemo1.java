import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        ArrayDemo1 ad = new ArrayDemo1();
          ad.replaceelement();
          ad.givenelement();
}
 private void givenelement() {
    int ar[] = {10,20,30,20,40,10,20,30};
    System.out.println("Enter the Element : ");
    Scanner in = new Scanner(System.in);
    int element = in.nextInt();
    int count = 0;
    int index = 0;
    for (int i = 0;i<ar.length;i++){
    if(ar[i]==element){
      count++;
      index = i;
    System.out.println("Index of element :"+index);
  }
  }
  System.out.println("Given element count : "+count);
  }

private void replaceelement() {
   int ar[] = {10,40,60,30};
   int ar1[] = new int[ar.length];
   int replace = 20;
   int j = ar.length-1;
   for (int i = 0;i<ar.length;i++) {
     if (i != j) {
      System.out.println(ar[i]);
      } else if (ar.length==ar1.length) {
         ar1[j] = replace;
         System.out.println(ar1[j]);
 }
 }
 }
}
