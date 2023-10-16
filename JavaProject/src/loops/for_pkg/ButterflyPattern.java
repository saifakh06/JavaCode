package loops.for_pkg;

public class ButterflyPattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=1;m<=n;m++) {
			for(int k=n;k>=m;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
