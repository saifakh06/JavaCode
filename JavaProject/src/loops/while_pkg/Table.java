package loops.while_pkg;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		 int counter = 1;
		 
		while(counter<=10) {
			//int mul = num*counter;
			System.out.println(num+" X "+counter+"= "+num*counter);
			counter++;
		}
		sc.close();
	} 

}
