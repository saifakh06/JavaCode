package practicePrograms;
import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here :");
		int num = sc.nextInt();
		
		int lastDigit ;
		
		lastDigit = num%10;
		
		System.out.println("Last digit of given number is :"+lastDigit);

	}

}
