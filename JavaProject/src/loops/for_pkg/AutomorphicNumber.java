package loops.for_pkg;

public class AutomorphicNumber {

	public static void main(String[] args) {
		
		int n = 76;
		int n1 = n ;
		int sqr = n*n;
		int cnt = 0;
	
		while(n>0) {
			n = n/10;
			cnt++;
		}
		int  div = (int)Math.pow(10, cnt);
		if(sqr%div==n1) {
			System.out.println(n1+" Automorphic number");
		}else {
			System.out.println(n1+" not a automorphic number");
		}
	}

}
