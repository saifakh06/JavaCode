package loops.while_pkg;

import java.util.Scanner;

public class FindPowerOfTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		
		int counter = 1;
		int res = 1;
		while(counter <=pow) {
			
			res  = res *num;
			counter ++;
		} System.out.println(res);

	}

}
