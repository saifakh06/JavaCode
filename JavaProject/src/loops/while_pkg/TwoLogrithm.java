package loops.while_pkg;

public class TwoLogrithm {

	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		double sum = 0;
		int sign = 1;
		while(i<=num) {
			sum = sum+(1.0*sign)/i;
			sign = sign*(-1);
			i++;
		}
		System.out.println(sum);

	}

}
