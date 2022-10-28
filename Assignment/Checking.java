interface printable{
void print();
}
interface execution extends printable{
void name();
}
class Checking implements execution{
public void print(){
System.out.println("Hello");}
public void name(){
System.out.println("Kavitha");}

public static void main(String[] args){
Checking obj = new Checking();
obj.print();
obj.name();
 }
}

