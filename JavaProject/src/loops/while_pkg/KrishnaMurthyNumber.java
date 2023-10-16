package loops.while_pkg;

public class KrishnaMurthyNumber {

	public static void main(String[] args) {
		int sum = 0;
		int num = 145;
		int num1=  num;
		while(num>0) {
			int ld = num%10;
			num = num/10;
			
			int fact = 1;
			
			for(int i = 1;i<=ld;i++) {
				fact = fact*i;
				
			} 
			sum = sum+fact;
			
		} if(num1==sum) {
			System.out.println(num1+" is a KM number");
		} else {
			System.out.println(num1+" is not a KM number");
		}

	}

}
