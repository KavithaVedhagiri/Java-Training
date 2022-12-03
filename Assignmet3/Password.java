import java.util.Scanner;
class Password{
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String user,password;
		System.out.println("Enter User Name");
		 user = in.nextLine();
		System.out.println ("Password");
		 password = in.nextLine();
         boolean valid = false; 
		
         if (password.length() > 15 || password.length() < 8)
         {
             valid = false;
             System.out.println("Password must have at least 8 characters");
         }
     else {

     for (int i = 0; i < password.length(); i++){
                     char pass = password.charAt(i);

                 if ((pass>=97 && pass <= 122)  || (pass >=65 && pass <= 90) || (pass>=48 && pass <=57)||(pass>=33 && pass<=46)) {
                     valid = true;
                 } else {
                     System.out.println("Password denied");
                     System.out.println("Only letter & digits & special character are acceptable.");
                     valid = false;
                     break;
                 }     
     if (valid == true) {
     System.out.println("Password accepted");
         break;
             }            
     }
     }
	}
}




