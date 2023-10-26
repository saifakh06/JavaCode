package arrays;

import java.util.Arrays;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,4,3,2,5,2,4};
		
		int arr_size = arr.length;
		System.out.println("Original Array --> "+Arrays.toString(arr));
		
		for(int i=0;i<arr_size;i++) {
			boolean found = false;
			for(int j=i;j<arr_size-1;j++) {
				if(arr[i]==arr[j+1]) {
					found = true;
				}
				
			}
			if(found==true) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
