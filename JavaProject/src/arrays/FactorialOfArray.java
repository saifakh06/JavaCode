package arrays;

import java.util.Arrays;

public class FactorialOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,4,7,8,3,5};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			
			int fact = 1;
			for(int x=1;x<=n;x++) {
				fact *= x;
			}
			System.out.print(fact+" ");
		}

	}

}
