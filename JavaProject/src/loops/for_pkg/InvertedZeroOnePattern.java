package loops.for_pkg;

public class InvertedZeroOnePattern {

	public static void main(String[] args) {
		int n = 4;                                          /* i have  to ask fazi bhai when i pass 3 in variable n when 
																when keeping j=n then i have to do (j+1-1)%2 or when i keep (j+i)%2
																the output coming like row(even add odd)*/
		//int cnt = 0;
		for(int i=1;i<=n;i++) {
			for(int j=4;j>=i;j--) {
				//cnt++;
				System.out.print((j+1)%2+" ");   
				// when i am running the same the code keeping n = 3 the whole get changes.
			}
			System.out.println();
		}

	}

}
