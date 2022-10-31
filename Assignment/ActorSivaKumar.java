interface Actor{
boolean makeUpRequired = true;
String address = "Chennai";

void act();
void dance();
void sing();

}

public class ActorSivaKumar implements Actor{

public void act(){
System.out.println("Acting");
}

public void dance(){
System.out.println("Dancing");
}

public void sing(){
System.out.println("Singing");
}

static String address = "Coimbatore";

void speaking(){
System.out.println("Speak");
}

ActorSivaKumar(){
super();
}
ActorSivaKumar(int number, String carName)
{

System.out.println(number);
System.out.println(carName);
}


public static void main(String args[]){

ActorSivaKumar as = new ActorSivaKumar(65, "Audi Car");

as.dance();
as.sing();
as.act();
System.out.println(as.address);

Actor ac = new ActorSivaKumar();
ac.dance();
ac.sing();
ac.act();
System.out.println(ac.address);
}
}


