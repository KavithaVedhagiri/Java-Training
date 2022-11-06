class Palindrom{
public static void main(String args[]){
int no = 153;
int no2 = no;
int no3 = no;
int no4 = no3;
//reverse order
int reverse = 0;
while(no>0){
System.out.println(no%10);
no = no/10;
} 
//reverse print order

while(no3>0){
int rem = no3%10;
reverse = reverse+rem*rem*rem;
no3 = no3/10;
}
if(no4==reverse)
System.out.println("The Given Number is Palindrom");
else
System.out.println("The Given Number is Not Palindrom");
}
}


