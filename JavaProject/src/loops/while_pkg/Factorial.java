package loops.while_pkg;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int counter = 1;
		int fact = 1;
		
		while(counter<=num) {
			fact*=counter;
			counter++;
		}
		System.out.println(fact);
		
		sc.close();
			
		} 
	}


