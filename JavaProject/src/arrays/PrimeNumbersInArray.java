package arrays;

import java.util.Arrays;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,8,4,5,13,14};
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			if(n<=0) {
				continue;
			}
			int count = 0;
			for(int x = 1;x<=n;x++) {
				if(n%x==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(n+" ");
			}
		}

	}

}
