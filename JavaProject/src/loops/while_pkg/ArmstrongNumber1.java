package loops.while_pkg;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		int num = 153;
		int num1 = num;
		int num2 = num;
		int count = 0;
		
		while(num>0) {
			int ld = num%10;
			count++;
			num = num/10;		
		}
		int sum = 0;
		int pow = 0;
		for(int i=1;i<=count;i++) {
			int ld = num1%10;
			 pow = (int)Math.pow(ld, count);
			num1 = num1/10;
			sum = sum + pow;
		}
		

	
	if(num2==sum) {
		System.out.println(num2 + " is a Armstrong number");
	} else {
		System.out.println(num2 + " not a Armstrong number");
	}
	

	}
}
