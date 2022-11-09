class NeonNukmber{
public static void main(String args[]){
int number = 9;
int square,rem,sum=0;
square = number*number;
//System.out.println(square);
while(square!=0){
rem = square%10;
sum+=rem;
square=square/10;
//System.out.println(sum);
}
if(number==sum){
System.out.println("The number is Neon Number "+" "+sum);
}
else{
System.out.println("The number is Not Neon Number "+" "+sum);
}
}
}
