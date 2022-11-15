class FibonacciSeries{
public static void main(String args[]){
int number = 0,number1 = 1,number3 = 0;
while(number<=20){
number3 = number+number1;
System.out.println(number3);
number = number1;
number1 = number3;
}
}
}
