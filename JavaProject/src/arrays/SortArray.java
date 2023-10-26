package arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String [] args) {
		int [] arr = {35,76,89,0,2,7};
		System.out.println(Arrays.toString(arr));
		
	for(int i=0;i<arr.length;i++) {
			
		
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
					
				}
			}
				
			}
	for(int x=0;x<arr.length;x++) {System.out.println(arr[x]);}
		
		 
		 
			
		}
	}


