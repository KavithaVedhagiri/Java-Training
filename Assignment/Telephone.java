public class Telephone
{
int price = 1500; 
String name = "Phone"; 
public void call()
    {
    System.out.println("Calling Facility"); 
    }
    public void receive_call()
    {
    System.out.println("Receiving call facility"); 
    }
public static void main(String[] args)
{
Telephone bsnl = new Telephone();
bsnl.call();
bsnl.receive_call();
{
System.out.println(bsnl.price); 
System.out.println(bsnl.name); }
}
}

