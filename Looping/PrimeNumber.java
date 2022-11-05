class PrimeNumber{
public static void main(String args[]){
int number = 30;
int div = 2;
int count = 0;
while(number>=div){
if(number%div==0)
count++;
div++;
}
System.out.println(count);
if (count==0)
System.out.println("The Number is Prime Number");
else
System.out.println("The Number is Not PrimeNumber");
}
}


