package practicePrograms;
import java.util.Scanner;

public class SopStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the age");
		int age  = sc.nextInt();
		
		System.out.print("I am "+name+"\nI am "+age+" year old");
		
		sc.close();
	}

}
