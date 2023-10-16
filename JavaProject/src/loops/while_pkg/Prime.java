package loops.while_pkg;

public class Prime {

	public static void main(String[] args) {
		
		int num = 11;
		int sp = 1;
		int count = 0;
		
		while (sp<=num) {
			if(num%sp==0) {
				count++;
			}
			sp++;
		}
		if(count==2) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" not a prime number");
		}

	}

}
