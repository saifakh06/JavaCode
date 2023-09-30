package practicePrograms;
import java.util.Scanner;

public class LibFineSystem {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers days you have been late to return the issued book");
		int late_days = sc.nextInt();
		String message = null;
		
		if(late_days>0 && late_days<=5) {
			message = "You have to pay a fine of ruppes = 0.5 ruppee";
			
		}else if (late_days>5 && late_days<=10) {
			message = "You have to pay a fine of ruppee = 1 ruppee";
			
		} else if(late_days>10 && late_days<=30) {
			message = "You have to pay a fine of ruppee = 5 ruppee";
			
		}else {
			message  = "As you failed to return the book within 30 days, Your membership has been cancelled please meet the Library Incharge";
			
		} 
		System.out.println(message);
	
	}

}
