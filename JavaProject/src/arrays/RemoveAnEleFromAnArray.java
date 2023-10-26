package arrays;

import java.util.Arrays;

public class RemoveAnEleFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {45,14,24,56,46,78};
		
		System.out.println("Original array"+ Arrays.toString(a));
		int removeIndex = 1;
		
		for(int i=removeIndex;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		System.out.println("Element Removed -->"+Arrays.toString(a));
		

	}

}
