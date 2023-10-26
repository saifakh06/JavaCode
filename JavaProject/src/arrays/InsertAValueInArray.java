package arrays;

import java.util.Arrays;

public class InsertAValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,45,6,76,9};
		int index = 3;
		int value = 45;
		
		System.out.println("Original array --> "+Arrays.toString(arr));
		arr[index] = value;
		System.out.println("After inserting --> "+Arrays.toString(arr));

	}

}
