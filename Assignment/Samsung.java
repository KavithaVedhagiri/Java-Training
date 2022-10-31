abstract class SmartPhone{
abstract int call(int seconds);
abstract void sendMessage();
abstract void receiveCall();
void browse(){
System.out.println("SmartPhone browsing");
}
public SmartPhone()
{
System.out.println("Smartphone under development");
}
}
abstract class FactoryDemo extends SmartPhone{
boolean OriginalPiece = false;
static int price = 0;
abstract void verifyFingerPrint();
abstract void providePattern();
void browse(){
System.out.println("Factory Demo browsing");
}
}
public class Samsung extends FactoryDemo{
static int price = 5000;
public static void main(String args[]){
Samsung sam = new Samsung();
sam.browse();
System.out.println(sam.price);
}
int call(int seconds){
System.out.println(seconds);
return seconds;
}
void sendMessage(){
System.out.println("Send a Message");
}
void receiveCall(){
System.out.println("Received a call");
}
void verifyFingerPrint(){
System.out.println("FingerPrint Verification");
}
void providePattern(){
System.out.println("Pattern Type");
}
}


