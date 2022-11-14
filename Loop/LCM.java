class LCM{
public static void main(String args[]){
int number = 3;
int number1 = 10;
int lcm= 0;
int big = number<number1?number:number1;
while(true){
if (big%number==0 && big%number1==0){
System.out.println(big);
break;
}
big++;
}
}
}
