package india.newDelhi;
import tamilnadu.chennai.TrafficRules;
interface TrafficRulesDelhi{
String trafficCommisssioner = "Navin";
void dontGoByDieselVehicle();
void goByBicycle();
}
interface TrafficRulesChennai{
void TrafficRulesChennai();
}
class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai{
public static void main(String args[]){
CommonManInDelhi comm = new CommonManInDelhi();
comm.dontGoByDieselVehicle();
comm.goByBicycle();
comm.TrafficRulesChennai();
}
public void TrafficRulesChennai(){
System.out.println("People Must Follow Traffic Rules");
}
public void dontGoByDieselVehicle(){
System.out.println("Don't go DieselVehicle");
}
public void goByBicycle(){
System.out.println("Go with Bicycle");
}
{
System.out.println("Name of trafficCommisssioner"+" "+trafficCommisssioner);
}
}
