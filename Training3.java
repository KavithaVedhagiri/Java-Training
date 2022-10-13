class Training3{
int time,days;
String coursename;
   //Default constructor
   Training3(){
      System.out.println("Default constructor");
   }
   /* Parameterized constructor with 
    * two integer arguments
    */
   Training3(String coursename,int time)
{
      System.out.println("CourseName "+coursename+" "+"CourseTime "+time);
   }
   /* Parameterized constructor with 
    * three integer arguments
    */
   Training3(String coursename,int time, int days){
      System.out.println("CourseName "+coursename+" "+"CourseTime "+time+" "+"Course_duration "+days);
   }
	   
   public static void main(String args[]){
      //This will invoke default constructor
      Training3 obj = new Training3();

      /* This will invoke the constructor 
       * with two int parameters
       */
      Training3 obj2 = new Training3("Java",1130);

      /* This will invoke the constructor 
       * with three int parameters
       */
      Training3 obj3 = new Training3("Java",1130,75);
	
      /* This will invoke the constructor 
       * with int and String parameters
       */
   }
}
