abstract class Old{
abstract void type1();	
}
class New extends Old {
 void type1(){
  System.out.println("type1 in class New");
 }
}
class Check {
public static void main(String[] args) {
New b = new New();
 b.type1();
  }
}

