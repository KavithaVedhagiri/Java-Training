class Armstrong{
public static void main(String args[]){
int no = 153;
int no2 = no;
int reverse = 0;
while(no2>0){
int rem = no2%10;
no2 = no2/10;
reverse = reverse+(rem*rem*rem);
}
if(no==reverse)
System.out.println("The Given Number is Armstrong Number");
else
System.out.println("The Given Number is not Armstrong Number");
}
}



