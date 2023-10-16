package loops.while_pkg;

public class ToPrintAllTheDigit {
	public static void main(String [] args) {
		
		int num = 4567;
		
		while (num>0) {
			int ld = num%10;
			num = num/10;
			System.out.println(ld);
		}
	}
}
