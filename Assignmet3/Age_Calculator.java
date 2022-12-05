import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Age_Calculator {

	public static void main(String[] args) {
		System.out.print("Please enter date of birth in  YYYY-MM-DD: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
	    LocalDate dateofbirth = LocalDate.parse(input);
	    LocalDate currendate = LocalDate.now();
	    Period period = Period.between(dateofbirth,currendate);
	    System.out.println("Age "+" "+"Years:" +" "+period.getYears()+" "+"Months: " + period.getMonths()+" "
	   +"Days: " + period.getDays());
		}
}

