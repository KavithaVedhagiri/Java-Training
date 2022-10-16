import java.util.Scanner;
public class Test {
   String name;
//constructor
   Test(String name){
      this.name = name;
  
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);/// user get input
      System.out.println("Enter your name: ");
      String name = sc.next();
      Test obj = new Test(name);
      System.out.println("wellcome to java course "+obj.name);
  

   }
}
