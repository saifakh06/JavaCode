package loops.for_pkg;

public class AbundantNumber {

	public static void main(String[] args) {
		int n = 18;
		int sum = 0;
		
		for(int i=1;i<n;i++) {
		if(n%i==0) {
			//	System.out.println(i);
				sum = sum+i;
			}
		}
		if(sum>n) {
			System.out.println(n+" is a abundant number");
		}
		else {
			System.out.println(n+" not a abundant number ");
		}

	}

}
