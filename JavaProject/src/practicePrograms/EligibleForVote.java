package practicePrograms;

public class EligibleForVote {
	public static void main(String [] args) {
		
		int age = 17;
		String result = (age>=18)? "You are eligible": "Not eligible";
		
		switch(result) {
		
		case "You are eligible" : System.out.println("You are eligible for voting");
		break;
		case "Not eligible" : System.out.println("You are not eligible for voting");
		break;
		default : System.out.println("Enter correct age");
		}
		System.out.println("\n----------------------End Program-------------------------------");
	}

}
