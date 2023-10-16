package functions;

public class PalindromeNumber {

	public static void main(String[] args) {
		palindrome_no(1222);

	}
	public static void palindrome_no(int n) {
		int n1 = n;
		int rev = 0;
		while(n>0) {
		int ld = n%10;
		rev = rev*10+ld;
		n = n/10;
		}
		if(n1==rev) {
			System.out.println(n1+" is a palindrome number");
		}else {
			System.out.println(n1+" not a palindrome number");
		}
		
		
	}

}
