class FibonacciSeries1{
public static void main(String args[]){
int number = 1,number1 = 1;
while(number<=20){
number = number1 - number;
number1 = number+number1;
System.out.println(number1);
}
}
}
