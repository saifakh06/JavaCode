package loops.while_pkg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num =153 ;
		int num1 = num;
		//int sp = 1;
		//int ld;
		//int mul1 = 0;
		int sum = 0;
		//int mul =1;
		
		while(num>0) {
			int mul1=0;
			int mul = 1;
			int ld = num%10;
			int sp = 1;
			while(sp<=3) {
				 
				mul = ld*mul;
				//System.out.println(mul);
				sp++;
			}
			mul1=mul;
			//mul=1;
			//System.out.println(mul);
			sum +=mul1;
			num = num/10;
		
		}
		if(num1==sum) {
			System.out.println(num1+" Is a Armstrong Number");
		} else {
			System.out.println(num1+" Not a Armstrong Number");
		}

	}

}
