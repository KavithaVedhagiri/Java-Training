class SpyNumber{
public static void main(String args[]){
int number = 132;
int sum =0,product=1,rem;
while(number>0){
rem = number%10;
sum = sum+rem;
product = product*rem;
number = number/10;
}
if(sum==product){
System.out.println("The Given number is SpyNumber");
}
else{
System.out.println("The Given number is Not SpyNumber");
}
}
}
