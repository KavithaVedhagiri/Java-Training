abstract class India{
abstract void speakLanguage();
abstract void eat();
abstract void dress();
static String capital = "New Delhi";

//India(){
//System.out.println("Zero Arg Constructor");
//}
public India(String primeMinister){
System.out.println("our Prime Minister is " +primeMinister);
}
}
abstract class SouthIndia extends India{

void cultivate(){
System.out.println("Rice and Wheat cultivation");
}

void livingStyle(){
System.out.println("Average development");
}

//SouthIndia(){
//super();
//}

SouthIndia(String primeMinister){
super("Narendar Modi");
System.out.println(super.capital);
}
}
public class TamilNadu extends SouthIndia{

static String capital = "Chennai";

void speakLanguage(){
System.out.println("Tamil");
}
void eat(){
System.out.println("Rice");
}
void dress(){
System.out.println("Saree");
}

void cultivate(){
System.out.println("Rice and Sugar cane cultivation");
}
void livingStyle(){
System.out.println("Above Average development");
}

//TamilNadu(){
//super();
//}
TamilNadu(String primeMinister){
super(primeMinister);
}

public static void main(String args[]){
//SouthIndia si = new TamilNadu();
SouthIndia si2 = new TamilNadu("Narendra Modi");
System.out.println(capital);
}
}

