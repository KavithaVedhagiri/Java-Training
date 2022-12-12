import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
ArrayDemo ad = new ArrayDemo(); 
String s = "AkshinthDevesh";
char[] name = s.toCharArray();
ad.find_first_repeated_element(name); 
}
public void find_first_repeated_element(char[] name) {
// TODO Auto-generated method stub
boolean repeat = false; 
for(int j =0; j<name.length-1; j++)
{
char key = name[j]; 
for(int i=j+1; i<name.length; i++)
{
if(key==name[i])
{	
System.out.println("First Repeated Element is "+ name[i]); 
repeat = true; 
break; 
}
}
if(repeat == true)
{
break; 
}
}
}
}
