package tamilnadu.chennai;
public interface TrafficRules{
String trafficCommisssioner = "Kavin"; 
public void goByDieselVehicle();
public void goByBicycle();
}
interface TrafficRulesChennai{
void TrafficRulesChennai();
}
class CommonManInChennai implements TrafficRules,TrafficRulesChennai{
public static void main(String args[]){
CommonManInChennai com = new CommonManInChennai();
com.goByDieselVehicle();
com.goByBicycle();
com.TrafficRulesChennai();
System.out.println("Name of trafficCommisssioner"+" "+TrafficRules.trafficCommisssioner);
}
public void TrafficRulesChennai(){
System.out.println("People Must Follow Traffic Rules");
}
public void goByDieselVehicle(){
System.out.println("DieselVehicle");
}
public void goByBicycle(){
System.out.println("ByBicycle");
}
}
