package loops.while_pkg;

public class NoOfDigit {

	public static void main(String[] args) {
		int num = 234637895;
		int count = 0;
		while(num>0) {
			int ld = num%10;
			count++;
			num = num/10;
		} 
		System.out.println(count);

	}

}
