class Trainer{
String dept = "Java";
String institute = "Payilagam";
private int salary = 10000;
public void getSalary(){
System.out.println(salary);
}
void training(){
System.out.println("Welcome to Our Institute");
}
Trainer(String dept,String institute){
this.dept=dept;
this.institute=institute;
System.out.println(dept);
System.out.println(institute);
}
}
public class SQLTrainer extends Trainer {
SQLTrainer(String dept,String institute){
super(dept,institute);
}
public static void main(String args[]){
Trainer trainerKumar = new Trainer("CSE","payilagam");
SQLTrainer ram = new SQLTrainer("Java","Payilagam");
ram.training();
ram.getSalary();
}
}






