package loops.for_pkg;

public class ZeroOnePattern {

	public static void main(String[] args) {
		int n = 5;
		int cnt = 0;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				cnt++;
				System.out.print(cnt%2+" ");
			}
			System.out.println();
		}

	}

}
