public class ArrayDemo {
public static void main(String[] args) {
ArrayDemo ad = new ArrayDemo(); 
ad.print_only_adjacent_values(); 
}
private void print_only_adjacent_values() {
int[] ar = {3, 8, 15, 7}; 
//	0  1   2  3
//3<8
for(int j = 0; j<ar.length-1; j++)
{
int small = ar[j]<ar[j+1]?ar[j]: ar[j+1];
int big = ar[j]>ar[j+1]? ar[j]: ar[j+1]; 
for(int i= small; i<=big; i++)
System.out.print(i+" "); 
System.out.println();
}
}
}
