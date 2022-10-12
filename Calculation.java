class Calculation
{
public static void main(String[] args)
{
Calculation cal = new Calculation();
 
cal.sub(20,30);//Arguments Passing
cal.multiply(10,30,50);
cal.divide(60,30);
cal.sub(5.5f, 6.5f);
}
void divide(int num1,int num2)//Parameter Passing
{
System.out.println(num1/num2);
}
void sub(int num1,int num2)//Parameter Passing
{
System.out.println(num1-num2);
}
void multiply(int num1,int num2,int num3)
{
System.out.println(num1*num2*num3);
}
void sub(float num1,float num2)
{
System.out.println(num1-num2);
}
}
