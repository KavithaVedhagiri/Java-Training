class FindPower1{
//printing 1 4 9 16 25 36 49 64 81 100
public static void main(String args[]){
int no = 1;
int power = 1;
int result = 1;
while(no<=10){
result = no*power;
System.out.println(result);
no++;
power++;
}
}
}
