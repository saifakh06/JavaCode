package loops.for_pkg;

public class RightAngledTriangle {

	public static void main(String[] args) {
		
		int num = 5;
		for(int i = 1;i<=num;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			

		}
		for(int m = 1;m<=num;m++) {
			for(int n = num;n>=m;n--) {
				System.out.print ("*");
			}
			System.out.println();
		}
		
	}

}
