package arrays;

import java.util.Arrays;

public class KMnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,145,786,456,76,2};

		
		for(int i = 0;i<arr.length;i++) {
			int n = arr[i];
			int n1 = arr[i]; 
			int sum = 0;

			while(n>0) {
				int ld = n%10;
				n = n/10;

				int fact = 1;
				for(int x=1;x<=ld;x++) {
					fact  = fact*x;
				}
				sum = sum+fact;
			}
			if(sum==n1) {
				System.out.println(n1+" is a special number");
			}
		}

	}

}
