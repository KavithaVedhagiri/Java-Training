class FindPower{
//printing 1,8,27,64
public static void main(String args[]){
int no = 1;
int power = 1;
int result = 1;
while(no<=4){
result = no*power*power;
System.out.println(result);
no++;
power++;
}
}
}
