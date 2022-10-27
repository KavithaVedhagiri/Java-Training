abstract class A {
abstract void m1();
static void m2(){
 System.out.println("One");	
 }
}
class B extends A {
 void m1(){
  System.out.println("m1 in class B");
 }
}
public class Test {
public static void main(String[] args) {
B b = new B();
 b.m1();
 A.m2();
  }
}
