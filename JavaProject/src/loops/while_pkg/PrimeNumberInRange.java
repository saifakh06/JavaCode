package loops.while_pkg;
import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the intial point");
		int intialPoint = sc.nextInt();
		
		System.out.println("enter the final point");
		int finalPoint = sc.nextInt();
		
		for(int j = intialPoint;j<=finalPoint;j++) {
			int cnt = 0;
			for(int i = 2;i<j;i++) {
				if(j%i==0) {
					cnt++;
				}// if(1)
				
			}// for(i)
			
			if(cnt==0) {
				System.out.println(j);
			} //if(2)
			
		}// for(j)
		sc.close();
		String path =  System.getProperty("user.dir");
		System.out.println(path);
	}

}
