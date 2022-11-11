class Factorial{
public static void main(String args[]){
//int number = 1;
//int factorial = 1;
//while(number<=5){
//factorial = factorial*number;
//number++;
//}
//System.out.println("Factorial of Number"+" "+factorial);
//}
//}
Factorial fact = new Factorial();
fact.display(1);
}
public void display(int number){
int factorial = 1;
while(number<=5){
factorial = factorial*number;
System.out.println("Factorial of Number"+" "+factorial);
number++;
}
}
}
