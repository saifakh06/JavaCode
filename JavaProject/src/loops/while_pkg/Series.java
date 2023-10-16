package loops.while_pkg;

public class Series {

	public static void main(String[] args) {
		double sum = 0;
		for(int i=1;i<=6;i++) {
			if(i%2==0) {
				sum = sum-(1.0/i);
			} else if (i%2!=0) {
				sum = sum+(1.0/i);
			}
		}
		System.out.println(sum);
	}

}
