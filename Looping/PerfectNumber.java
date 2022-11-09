class PerfectNumber{
public static void main(String args[]){
int number = 28,
div=1;
int sum=0;
while(div<=number/2){
if(number%div==0)
sum = sum+div;
div++;
//System.out.println(sum);
}
if(number==sum){
System.out.println("The Number is Perfect Number" +" "+sum);
}
else{
System.out.println("The Number is Not Perfect Number"+" "+sum);
}
}
}
