class Employee{  
int id;  
String name;  
//creating a parameterized constructor  
Employee(int id,String name){  
this.id = id;  
this.name = name;  
}  
//method to display the values  
void display()
{System.out.println("EmployeeID "+id+" "+"EmployeeName "+name);}  
   
public static void main(String args[]){  
//creating objects and passing values  
Employee Emp1 = new Employee(10341,"Karan");  
Employee Emp2 = new Employee(10342,"Devesh");  
//calling method to display the values of object  
Emp1.display();  
Emp2.display();  
}  
}  
