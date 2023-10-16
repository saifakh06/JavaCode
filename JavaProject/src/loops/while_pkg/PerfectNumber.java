package loops.while_pkg;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the intialPoint");
//		int intialPoint = sc.nextInt();
//		
//		System.out.println("Enter the final point");
//		int finalPoint = sc.nextInt();
		
		int sum = 0;
		for(int num = 1;num<=10;num++) {

			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum = sum+i;
				}
			}
				if(num==sum) {
					System.out.println(num+" is a perfect number");
				} else {
					System.out.println("not a perfect number");
				}

		}
	}
}


