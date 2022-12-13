import java.util.Scanner;

public class Array {	 
public static void main(String[] args) {		
Array ad = new Array(); 
ad.store_reverse_order(); 
}
private void store_reverse_order() {
int[] ar1 = {100,200,300,400}; 
int[] ar2 = new int[ar1.length]; 
int i=0, j = ar1.length-1;
for(; i<ar1.length; i++)
{ 
ar2[i] = ar1[j]; 
System.out.print(ar2[i] + " "); 
j--; 
}
}
}
