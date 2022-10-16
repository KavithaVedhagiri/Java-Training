class EmployeeInfo{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    EmployeeInfo(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    //creating three arg constructor  
    EmployeeInfo(int id,String name,int age){  
    this.id = id;  
    this.name = name;  
    this.age=age;  
    }  
    void display()
    { 
    System.out.println("Employee ID "+id+" "+name+" "+age);
    }  
   
    public static void main(String args[]){  
    EmployeeInfo empl1 = new EmployeeInfo(101213,"Karan");  
    EmployeeInfo empl2 = new EmployeeInfo(112579,"Aryan",29);  
    empl1.display();  
    empl2.display();  
   }  
}  
