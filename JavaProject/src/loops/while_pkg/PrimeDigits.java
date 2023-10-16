package loops.while_pkg;
import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		while(num>0) {
			int ld = num%10;
			int count = 0;
			for(int i=1;i<=num;i++) {
				if(ld%i==0) {
					count++;
				}
			} if(count==2) {
				System.out.print(" "+ld);
			}
			num = num/10;
		}
			
				
		

	}

}
