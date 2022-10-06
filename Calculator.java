class Calculator
{

public static void main(String[] args)
{
Calculator calc = new Calculator(); // Constructor: 
//using calculator I am going to add two numbers
calc.add();
calc.subtract(); 
calc.multiply(); 
calc.divide(); 
// . --> dot operator

}
void divide()
{
System.out.println(10/20);
}
void multiply()
{
System.out.println(10*20);
}
void subtract()
{
System.out.println(10-20);
}
void add()
{
System.out.println(10+20);
} 
} 
