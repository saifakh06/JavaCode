package functions;

public class KrishnaMurthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=200;i++) {
		krish_no(i);
		}

	}
	public static void krish_no(int n) {
		int num = n;
		int sum = 0;
		
		while(n>0) {
			int ld = n%10;
			n = n/10;
			
			int fact = 1;
			for(int i=1;i<=ld;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			
		}
		if(sum == num) {
			System.out.println(num+" is KM number");
		} 
	}

}
