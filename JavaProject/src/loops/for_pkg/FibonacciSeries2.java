package loops.for_pkg;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int a = 0;
		int b = 1;
		int third = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i = 0;i<n-2;i++) {
			third = a+b;
			System.out.print(third+" ");
			a = b;
			b = third;
		}
	}

}
