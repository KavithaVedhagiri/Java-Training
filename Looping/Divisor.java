class Divisor{
public static void main(String args[]){
int number = 100;
int div = 2;
int count = 0;
while(number>=div){
if (number%div==0)
//System.out.println(div);
count++;
div++;
}
System.out.println("No of Divisors"+" "+count);
}
}
