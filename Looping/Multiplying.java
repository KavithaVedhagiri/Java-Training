class Multiplying{
public static void main(String args[]){
int number = 1;
while(number<=30){
if (number%3==0 && number%5==0){
System.out.println(number);
}
if(number%3==0 || number%5==0){
System.out.println("Mutiplying number of 3 and 5 "+" "+number);
}
number++;
}
}
}

